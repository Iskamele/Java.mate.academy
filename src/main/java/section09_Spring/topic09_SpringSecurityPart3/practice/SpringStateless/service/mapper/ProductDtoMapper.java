package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.mapper;

import org.springframework.stereotype.Component;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.Product;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.dto.ProductRequestDto;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.dto.ProductResponseDto;

@Component
public class ProductDtoMapper {
    public Product mapToModel(ProductRequestDto requestDto) {
        Product product = new Product();
        product.setPrice(requestDto.getPrice());
        product.setName(requestDto.getName());
        return product;
    }

    public ProductResponseDto mapToDto(Product product) {
        ProductResponseDto responseDto = new ProductResponseDto();
        responseDto.setId(product.getId());
        responseDto.setName(product.getName());
        responseDto.setPrice(product.getPrice());
        return responseDto;
    }
}
