package section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.service;

import java.util.List;
import section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.model.Product;

public interface ProductService {
    List<Product> getAllFromFile(String filePath);
}
