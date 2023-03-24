package Other.DirectoryNameConverterV2;

import java.util.List;
import Other.DirectoryNameConverterV2.service.DirectoryCreatorService;
import Other.DirectoryNameConverterV2.service.DirectoryProcessorService;
import Other.DirectoryNameConverterV2.service.FileReaderService;
import Other.DirectoryNameConverterV2.service.impl.DirectoryCreatorServiceImpl;
import Other.DirectoryNameConverterV2.service.impl.DirectoryProcessorServiceImpl;
import Other.DirectoryNameConverterV2.service.impl.FileReaderServiceImpl;

public class Main {
    public static void main(String[] args) {
        String fromFile = "src/main/java/Other/DirectoryNameConverterV2/names.txt";
        String toPath = "src/main/java/";

        FileReaderService fileReaderService = new FileReaderServiceImpl();
        DirectoryProcessorService directoryProcessorService = new DirectoryProcessorServiceImpl();
        DirectoryCreatorService directoryCreatorService = new DirectoryCreatorServiceImpl();

        List<String> readFile = fileReaderService.readFile(fromFile);
        List<String> directoriesNamesFromStrings = directoryProcessorService.getDirectoriesNamesFromStrings(readFile);
        directoryCreatorService.createDirectories(toPath, directoriesNamesFromStrings);
    }
}
