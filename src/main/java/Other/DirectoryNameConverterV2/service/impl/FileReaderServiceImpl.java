package Other.DirectoryNameConverterV2.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import Other.DirectoryNameConverterV2.service.FileReaderService;

public class FileReaderServiceImpl implements FileReaderService {
    @Override
    public List<String> readFile(String fromFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fromFilePath))) {
            return reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Can't read data from file " + fromFilePath, e);
        }
    }
}
