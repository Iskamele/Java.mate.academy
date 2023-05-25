package section09_Spring.topic03_SpringWeb.theory.T05_DifferenceBetweenControllerAndRestController.controller;

import java.math.BigDecimal;
import java.util.List;
import section09_Spring.topic03_SpringWeb.theory.T05_DifferenceBetweenControllerAndRestController.model.Product;
import section09_Spring.topic03_SpringWeb.theory.T05_DifferenceBetweenControllerAndRestController.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody
public class ProductController {
    private final ProductService productService;

    @Autowired // эта аннотация опциональная, если у нас только 1 конструктор
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        //return productService.findAll();
        return List.of(new Product(1L, "iPhone 7", BigDecimal.valueOf(588)));
    }
}
