package section09_Spring.topic03_SpringWeb.theory.T04_WhatIsResponseBodyAnnotation.config;

import section09_Spring.topic03_SpringWeb.theory.T02_SpringWebInDeep.config.AppConfig;
import section09_Spring.topic03_SpringWeb.theory.T02_SpringWebInDeep.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
