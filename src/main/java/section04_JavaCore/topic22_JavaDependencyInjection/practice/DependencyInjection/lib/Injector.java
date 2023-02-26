package section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.lib;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.service.FileReaderService;
import section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.service.ProductParser;
import section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.service.ProductService;
import section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.service.impl.FileReaderServiceImpl;
import section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.service.impl.ProductParserImpl;
import section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.service.impl.ProductServiceImpl;

public class Injector {
    private static final Map<Class<?>, Class<?>> INTERFACE_IMPLEMENTATIONS =
            Map.of(FileReaderService.class, FileReaderServiceImpl.class,
                    ProductService.class, ProductServiceImpl.class,
                    ProductParser.class, ProductParserImpl.class);
    private static final Injector injector = new Injector();
    private final Map<Class<?>, Object> instancesMap = new HashMap<>();

    public static Injector getInjector() {
        return injector;
    }

    public Object getInstance(Class<?> interfaceClazz) {
        Object clazzImplementationInstance = null;
        Class<?> clazz = findImplementation(interfaceClazz);
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Inject.class)) {
                Object fieldInstance = getInstance(field.getType());
                clazzImplementationInstance = createNewInstance(clazz);
                try {
                    field.setAccessible(true);
                    field.set(clazzImplementationInstance, fieldInstance);
                } catch (ReflectiveOperationException e) {
                    throw new RuntimeException("Can't initialize field value. Class: "
                            + clazz.getName()
                            + ". Field: "
                            + field.getName(), e);
                }
            }
        }
        if (clazzImplementationInstance == null) {
            clazzImplementationInstance = createNewInstance(clazz);
        }
        return clazzImplementationInstance;
    }

    private Object createNewInstance(Class<?> clazz) {
        if (instancesMap.containsKey(clazz)) {
            return instancesMap.get(clazz);
        }
        try {
            Constructor<?> constructor = clazz.getConstructor();
            Object instance = constructor.newInstance();
            instancesMap.put(clazz, instance);
            return instance;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Can't create a new instance of " + clazz.getName());
        }
    }

    private Class<?> findImplementation(Class<?> interfaceClazz) {
        Class<?> implementationClass = INTERFACE_IMPLEMENTATIONS.get(interfaceClazz);
        if (implementationClass.isAnnotationPresent(Component.class)) {
            return implementationClass;
        } else {
            throw new RuntimeException("Can't create an instance of class without annotation "
                    + Component.class.getName());
        }
    }
}
