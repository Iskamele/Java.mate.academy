package section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.service.mapper;

import section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.model.Product;
import section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.model.dto.ProductRequestDto;
import section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.model.dto.ProductResponseDto;
import org.springframework.stereotype.Component;

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
