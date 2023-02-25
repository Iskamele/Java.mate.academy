package section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.service.impl;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.lib.Component;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.service.LogService;

@Component
public class LogServiceImpl implements LogService {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
