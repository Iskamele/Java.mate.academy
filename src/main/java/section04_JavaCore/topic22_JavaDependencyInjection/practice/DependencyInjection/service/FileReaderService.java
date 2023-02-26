package section04_JavaCore.topic22_JavaDependencyInjection.practice.DependencyInjection.service;

import java.util.List;

public interface FileReaderService {
    List<String> readFile(String fileName);
}
