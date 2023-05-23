package section09_Spring.topic02_BeanLifeCycle.theory.T02_WhatIsBeanScope.service;

import java.io.File;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.lib.Component;
import org.springframework.context.annotation.Scope;

@Component // prototype
@Scope(scopeName = "prototype")
public class FileService {
    private File file;

    public FileService(File file) {
        this.file = file;
    }

    private void write(String context) {
        // TODO add some implementations
    }

    private String read() {
        // TODO add some implementations
        return "";
    }
}
