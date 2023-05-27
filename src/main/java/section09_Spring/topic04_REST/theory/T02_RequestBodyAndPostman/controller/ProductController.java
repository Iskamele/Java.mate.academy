package section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.model.Product;
import section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.model.dto.ProductRequestDto;
import section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.model.dto.ProductResponseDto;
import section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.service.ProductService;
import section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.service.mapper.ProductDtoMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public ProductResponseDto create(@RequestBody ProductRequestDto product) {
        return productDtoMapper.parse(productService.save(productDtoMapper.toModel(product)));
    }

    @GetMapping("/{id}")
    public ProductResponseDto get(@PathVariable Long id) {
        return productDtoMapper.parse(productService.get(id));
    }

    @GetMapping("/find")
    public List<ProductResponseDto> getAllByBrand(@RequestParam String brand) {
        return productService.findByBrand(brand)
                .stream()
                .map(productDtoMapper::parse)
                .collect(Collectors.toList());
    }

    @GetMapping("/inject")
    public String injectMockData() {
        Product iPhone = new Product();
        iPhone.setName("iPhone 7");
        iPhone.setPrice(BigDecimal.valueOf(499));
        iPhone.setBrand("Apple");

        Product samsung = new Product();
        samsung.setName("Samsung S20");
        samsung.setPrice(BigDecimal.valueOf(695));
        samsung.setBrand("Samsung");

        Product samsung10 = new Product();
        samsung10.setName("Samsung S10");
        samsung10.setPrice(BigDecimal.valueOf(600));
        samsung.setBrand("Samsung");

        productService.save(iPhone);
        productService.save(samsung);
        productService.save(samsung10);
        return "Done";
    }
}

