package section09_Spring.topic05_RESTPractice.theory.T01_DTOValidation.service.mapper;

import org.springframework.stereotype.Component;
import section09_Spring.topic05_RESTPractice.theory.T01_DTOValidation.model.Product;
import section09_Spring.topic05_RESTPractice.theory.T01_DTOValidation.model.dto.ProductRequestDto;
import section09_Spring.topic05_RESTPractice.theory.T01_DTOValidation.model.dto.ProductResponseDto;

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
