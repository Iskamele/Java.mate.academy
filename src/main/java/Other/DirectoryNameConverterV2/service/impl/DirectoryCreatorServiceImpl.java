package Other.DirectoryNameConverterV2.service.impl;

import java.io.File;
import Other.DirectoryNameConverterV2.service.DirectoryCreatorService;
import java.util.List;

public class DirectoryCreatorServiceImpl implements DirectoryCreatorService {
    @Override
    public void createDirectories(String toPath, List<String> paths) {
        new File(toPath + "/theory").mkdir();
        new File(toPath + "/practice").mkdir();
        for (String path : paths) {
            File directory = new File(toPath + "/theory/"  +  path);
            directory.mkdir();
        }
    }
}
