package section09_Spring.topic06_SpringSecurityPart1.theory.T03_StartSecurityConfigurationPart.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import section09_Spring.topic03_SpringWeb.theory.T02_SpringWebInDeep.config.AppConfig;
import section09_Spring.topic03_SpringWeb.theory.T02_SpringWebInDeep.config.WebConfig;

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
