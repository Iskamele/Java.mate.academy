package Other.DirectoryNameConverterV2.service.impl;

import java.io.File;
import java.util.List;
import Other.DirectoryNameConverterV2.service.DirectoryCreatorService;

public class DirectoryCreatorServiceImpl implements DirectoryCreatorService {
    @Override
    public void createDirectories(String toPath, List<String> paths) {
        for (String path : paths) {
            File directory = new File(toPath + "/" +  path);
            directory.mkdir();
        }
    }
}
