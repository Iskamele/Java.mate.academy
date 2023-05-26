package section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.service.mapper;

import section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.model.Product;
import section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.model.dto.ProductRequestDto;
import section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.model.dto.ProductResponseDto;
import section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDtoMapper {
    @Autowired
    private CategoryService categoryService;

    public ProductResponseDto parse(Product product) {
        ProductResponseDto responseDto = new ProductResponseDto();
        responseDto.setId(product.getId());
        responseDto.setBrand(product.getBrand());
        responseDto.setName(product.getName());
        responseDto.setPrice(product.getPrice());
        responseDto.setCategoryId(product.getCategory().getId());
        return responseDto;
    }

    public Product toModel(ProductRequestDto requestDto) {
        Product product = new Product();
        product.setBrand(requestDto.getBrand());
        product.setName(requestDto.getName());
        product.setPrice(requestDto.getPrice());
        product.setCategory(categoryService.get(requestDto.getCategoryId()));
        return product;
    }
}
