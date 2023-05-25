package section09_Spring.topic03_SpringWeb.theory.T06_WhatIsDTO.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import section09_Spring.topic03_SpringWeb.theory.T06_WhatIsDTO.model.Product;
import section09_Spring.topic03_SpringWeb.theory.T06_WhatIsDTO.model.dto.ProductResponseDto;
import section09_Spring.topic03_SpringWeb.theory.T06_WhatIsDTO.service.ProductService;
import section09_Spring.topic03_SpringWeb.theory.T06_WhatIsDTO.service.mapper.ProductDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final ProductDtoMapper productDtoMapper;

    @Autowired
    public ProductController(ProductService productService, ProductDtoMapper productDtoMapper) {
        this.productService = productService;
        this.productDtoMapper = productDtoMapper;
    }

    @GetMapping("/")
    public List<ProductResponseDto> getAllProducts() {
        return productService.findAll().stream()
                .map(productDtoMapper::parse)
                .collect(Collectors.toList());
    }

    @GetMapping("/inject")
    public String injectMockData() {
        Product iPhone = new Product();
        iPhone.setName("iPhone 7");
        iPhone.setPrice(BigDecimal.valueOf(499));

        Product samsung = new Product();
        samsung.setName("Samsung S20");
        samsung.setPrice(BigDecimal.valueOf(695));

        Product samsung10 = new Product();
        samsung10.setName("Samsung S10");
        samsung10.setPrice(BigDecimal.valueOf(600));

        productService.save(iPhone);
        productService.save(samsung);
        productService.save(samsung10);
        return "Done";
    }
}
