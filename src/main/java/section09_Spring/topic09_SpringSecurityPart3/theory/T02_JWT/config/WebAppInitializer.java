package section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import section09_Spring.topic09_SpringSecurityPart3.theory.T01_Stateless.config.AppConfig;
import section09_Spring.topic09_SpringSecurityPart3.theory.T01_Stateless.config.WebConfig;

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
