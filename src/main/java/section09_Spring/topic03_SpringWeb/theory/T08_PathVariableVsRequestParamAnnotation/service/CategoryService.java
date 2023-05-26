package section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.service;

import section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.model.Category;

public interface CategoryService {
    Category get(Long id);
}
