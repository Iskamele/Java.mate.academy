package Other.DirectoryNameConverterV2.service.impl;

import java.util.ArrayList;
import java.util.List;
import Other.DirectoryNameConverterV2.service.DirectoryProcessorService;

public class DirectoryProcessorServiceImpl implements DirectoryProcessorService {

    @Override
    public List<String> getDirectoriesNamesFromStrings(List<String> strings) {
        List<String> result = new ArrayList<>();
        int single = 1;
        int tenths = 0;
        for (String string : strings) {
            StringBuilder builder = new StringBuilder();
            if (string.isEmpty()) {
                continue;
            }
            String[] words = string.replaceAll("[^a-zA-Z ]", "").split(" ");
            builder.append("T")
                    .append(tenths)
                    .append(single)
                    .append("_");
            for (String word : words) {
                builder.append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1));
            }
            single++;
            if (single > 9) {
                tenths++;
                single = 0;
            }
            result.add(builder.toString());
        }
        return result;
    }
}
