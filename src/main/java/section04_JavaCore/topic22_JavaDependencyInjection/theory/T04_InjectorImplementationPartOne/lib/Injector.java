package section04_JavaCore.topic22_JavaDependencyInjection.theory.T04_InjectorImplementationPartOne.lib;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.service.AccountService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.service.BankService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T04_InjectorImplementationPartOne.service.AuthenticationManager;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T04_InjectorImplementationPartOne.service.impl.AccountServiceImpl;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T04_InjectorImplementationPartOne.service.impl.AuthenticationManagerImpl;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T04_InjectorImplementationPartOne.service.impl.BankServiceImpl;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Injector {
    private static final Injector injector = new Injector();

    public static Injector getInjector() {
        return injector;
    }

    public Object getInstance(Class<?> interfaceClazz) {
        Class<?> clazz = findImplementation(interfaceClazz);
        Field[] declaredFields = interfaceClazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Inject.class)) {
                // create a new object of field type
                Object fieldInstance = getInstance(field.getType());

                // create an object of interfaceClazz (or implementation class)
                Object classImplementationInstance = createNewInstance(clazz);

                // set 'field type object' to 'interfaceClazz object'

            }
        }
        return null;
    }

    private Object createNewInstance(Class<?> clazz) {
        return null;
    }

    private Class<?> findImplementation(Class<?> interfaceClazz) {
        Map<Class<?>, Class<?>> interfaceImplementations = new HashMap<>();
        interfaceImplementations.put(BankService.class, BankServiceImpl.class);
        interfaceImplementations.put(AccountService.class, AccountServiceImpl.class);
        interfaceImplementations.put(AuthenticationManager.class, AuthenticationManagerImpl.class);
        return interfaceImplementations.get(interfaceClazz);
    }
}
