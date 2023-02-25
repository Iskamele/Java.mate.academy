package section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.service.impl;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.service.LogService;

public class LogServiceImpl implements LogService {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
