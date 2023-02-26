package section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection;

import java.util.List;
import section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.lib.Injector;
import section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.model.Product;
import section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.service.ProductService;

public class Main {

    public static void main(String[] args) {
        // Please test your Injector here. Feel free to push this class as a part of your solution
        Injector injector = Injector.getInjector();
        ProductService productService = (ProductService) injector.getInstance(ProductService.class);
        List<Product> products = productService.getAllFromFile("products.txt");
        products.forEach(System.out::println);
    }
}
