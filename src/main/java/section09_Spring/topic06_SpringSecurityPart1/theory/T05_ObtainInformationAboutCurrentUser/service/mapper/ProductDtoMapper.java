package section09_Spring.topic06_SpringSecurityPart1.theory.T05_ObtainInformationAboutCurrentUser.service.mapper;

import org.springframework.stereotype.Component;
import section09_Spring.topic06_SpringSecurityPart1.theory.T02_StartSecurityConfiguration.model.Product;
import section09_Spring.topic06_SpringSecurityPart1.theory.T02_StartSecurityConfiguration.model.dto.ProductRequestDto;
import section09_Spring.topic06_SpringSecurityPart1.theory.T02_StartSecurityConfiguration.model.dto.ProductResponseDto;

@Component
public class ProductDtoMapper {

    public ProductResponseDto parse(Product product) {
        ProductResponseDto responseDto = new ProductResponseDto();
        responseDto.setId(product.getId());
        responseDto.setBrand(product.getBrand());
        responseDto.setName(product.getName());
        responseDto.setPrice(product.getPrice());
        return responseDto;
    }

    public Product toModel(ProductRequestDto requestDto) {
        Product product = new Product();
        product.setBrand(requestDto.getBrand());
        product.setName(requestDto.getName());
        product.setPrice(requestDto.getPrice());
        return product;
    }
}
