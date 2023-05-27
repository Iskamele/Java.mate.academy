package section09_Spring.topic04_REST.theory.T03_PutMappingDeleteMappingREST.controller;

import java.util.List;
import java.util.stream.Collectors;
import section09_Spring.topic04_REST.theory.T03_PutMappingDeleteMappingREST.model.Product;
import section09_Spring.topic04_REST.theory.T03_PutMappingDeleteMappingREST.model.dto.ProductRequestDto;
import section09_Spring.topic04_REST.theory.T03_PutMappingDeleteMappingREST.model.dto.ProductResponseDto;
import section09_Spring.topic04_REST.theory.T03_PutMappingDeleteMappingREST.service.ProductService;
import section09_Spring.topic04_REST.theory.T03_PutMappingDeleteMappingREST.service.mapper.ProductDtoMapper;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    /**
     * TODO
     * Http.DELETE
     * REST
     * get data -> http>GET
     * create data -> http>POST
     * update data -> http>PUT || http>PATCH
     * PUT для всей Entity, PATCH для некоторых полей
     * delete data -> http>DELETE
     */

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

    @GetMapping("/find")
    public List<ProductResponseDto> getAllByBrand(@RequestParam String brand) {
        return productService.findByBrand(brand)
                .stream()
                .map(productDtoMapper::parse)
                .collect(Collectors.toList());
    }
}

