package section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.lib;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.service.AccountService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.service.AuthenticationManager;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.service.BankService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.service.LogService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.service.impl.AccountServiceImpl;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.service.impl.AuthenticationManagerImpl;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.service.impl.BankServiceImpl;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.service.impl.LogServiceImpl;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Injector {
    private static final Injector injector = new Injector();

    public static Injector getInjector() {
        return injector;
    }

    private Map<Class<?>, Object> instances = new HashMap<>();

    public Object getInstance(Class<?> interfaceClazz) {
        Object clazzImplementationInstance = null;
        Class<?> clazz = findImplementation(interfaceClazz);
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Inject.class)) {
                // create a new object of field type
                Object fieldInstance = getInstance(field.getType());

                // create an object of interfaceClazz (or implementation class)
                clazzImplementationInstance = createNewInstance(clazz);

                // set 'field type object' to 'interfaceClazz object'
                try {
                    field.setAccessible(true);
                    field.set(clazzImplementationInstance, fieldInstance);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Can't initialize field value. " +
                            "Clazz: " + clazz.getName() + ". Field: " + field.getName());
                }
            }
        }
        if (clazzImplementationInstance == null) {
            clazzImplementationInstance = createNewInstance(clazz);
        }
        return clazzImplementationInstance;
    }

    private Object createNewInstance(Class<?> clazz) {
        // if we create an object - let's use it
        if (instances.containsKey(clazz)) {
            return instances.get(clazz);
        }
        // create a new object
        try {
            Constructor<?> constructor = clazz.getConstructor();
            Object instance = constructor.newInstance();
            instances.put(clazz, instance);
            return instance;
        } catch (NoSuchMethodException | IllegalAccessException
                 | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException("Can't create a new instance of " + clazz.getName());
        }
    }

    private Class<?> findImplementation(Class<?> interfaceClazz) {
        Map<Class<?>, Class<?>> interfaceImplementations = new HashMap<>();
        interfaceImplementations.put(BankService.class, BankServiceImpl.class);
        interfaceImplementations.put(AccountService.class, AccountServiceImpl.class);
        interfaceImplementations.put(AuthenticationManager.class, AuthenticationManagerImpl.class);
        interfaceImplementations.put(LogService.class, LogServiceImpl.class);
        if (interfaceClazz.isInterface()) {
            return interfaceImplementations.get(interfaceClazz);
        }
        return interfaceClazz;
    }
}
