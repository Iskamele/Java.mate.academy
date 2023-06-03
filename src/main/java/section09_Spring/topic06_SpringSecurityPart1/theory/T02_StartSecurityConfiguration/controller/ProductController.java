package section09_Spring.topic06_SpringSecurityPart1.theory.T02_StartSecurityConfiguration.controller;

import java.util.List;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import section09_Spring.topic06_SpringSecurityPart1.theory.T02_StartSecurityConfiguration.model.Product;
import section09_Spring.topic06_SpringSecurityPart1.theory.T02_StartSecurityConfiguration.model.dto.ProductRequestDto;
import section09_Spring.topic06_SpringSecurityPart1.theory.T02_StartSecurityConfiguration.model.dto.ProductResponseDto;
import section09_Spring.topic06_SpringSecurityPart1.theory.T02_StartSecurityConfiguration.service.ProductService;
import section09_Spring.topic06_SpringSecurityPart1.theory.T02_StartSecurityConfiguration.service.mapper.ProductDtoMapper;

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

    @GetMapping("/")
    public List<ProductResponseDto> getAllProducts() {
        return productService.findAll().stream()
                .map(productDtoMapper::parse)
                .collect(Collectors.toList());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponseDto create(@RequestBody @Valid ProductRequestDto product) {
        return productDtoMapper.parse(productService.save(productDtoMapper.toModel(product)));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }

    @PutMapping("{/id}")
    public ProductResponseDto update(@PathVariable Long id,
                                     @RequestBody ProductRequestDto requestDto) {
        Product product = productDtoMapper.toModel(requestDto);
        product.setId(id);
        Product updatedProduct = productService.update(product);
        return productDtoMapper.parse(updatedProduct);
    }

    @GetMapping("/{id}")

    public ProductResponseDto get(@PathVariable Long id) {
        return productDtoMapper.parse(productService.get(id));
    }
}

