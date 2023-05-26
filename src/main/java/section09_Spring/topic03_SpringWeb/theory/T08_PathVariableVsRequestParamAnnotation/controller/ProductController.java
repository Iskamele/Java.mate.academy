package section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.model.Product;
import section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.model.dto.ProductResponseDto;
import section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.service.ProductService;
import section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.service.mapper.ProductDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final ProductDtoMapper productDtoMapper;

    @Autowired
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

    // PathVariable целесобразно использовать для приёма уникальных идендификаторов ресурсов
    // Использовать тогда, когда нужно передать с клиента на сервер уникальный идентификатор, типа ID
    @GetMapping
    public ProductResponseDto get(@PathVariable Long id) {
        return productDtoMapper.parse(productService.get(id));
    }

    // ...products/find?brand=Apple
    // Использовать тогда, когда нужно отфильтровать данные по бренду, цене или цвету
    // Можно использовать несколько параметров ...products/find?brand=Apple&color=red
    @GetMapping("/find")
    public List<ProductResponseDto> getAllByBrand(@RequestParam String brand,
                                                  @RequestParam String color) {
        return productService.findByBrand(brand).stream()
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

