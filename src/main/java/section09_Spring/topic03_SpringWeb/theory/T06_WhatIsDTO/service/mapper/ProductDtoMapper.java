package section09_Spring.topic03_SpringWeb.theory.T06_WhatIsDTO.service.mapper;

import section09_Spring.topic03_SpringWeb.theory.T06_WhatIsDTO.model.Product;
import section09_Spring.topic03_SpringWeb.theory.T06_WhatIsDTO.model.dto.ProductResponseDto;
import org.springframework.stereotype.Component;

@Component
public class ProductDtoMapper {

    public ProductResponseDto parse(Product product) {
        ProductResponseDto responseDto = new ProductResponseDto();
        responseDto.setId(product.getId());
        responseDto.setName(product.getName());
        responseDto.setPrice(product.getPrice());
        return responseDto;
    }
}
