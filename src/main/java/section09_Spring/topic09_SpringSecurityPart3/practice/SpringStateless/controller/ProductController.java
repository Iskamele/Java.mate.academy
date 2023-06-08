package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.dto.ProductResponseDto;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.ProductService;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.mapper.ProductDtoMapper;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final ProductDtoMapper productDtoMapper;

    public ProductController(ProductService productService,
                             ProductDtoMapper productDtoMapper) {
        this.productService = productService;
        this.productDtoMapper = productDtoMapper;
    }

    @GetMapping
    public List<ProductResponseDto> getAllProducts() {
        return productService.findAll().stream()
                .map(productDtoMapper::mapToDto)
                .toList();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }
}
