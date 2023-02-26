package section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.lib.Component;
import section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.lib.Inject;
import section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.model.Product;
import section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.service.FileReaderService;
import section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.service.ProductParser;
import section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService {
    @Inject
    private ProductParser productParser;
    @Inject
    private FileReaderService fileReaderService;

    @Override
    public List<Product> getAllFromFile(String filePath) {
        return fileReaderService.readFile(filePath)
                .stream()
                .map(productParser::parse)
                .collect(Collectors.toList());
    }
}
