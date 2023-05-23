package section09_Spring.topic02_BeanLifeCycle.theory.T04_SingletonAndPrototypeLifecycleDifference;

import java.io.File;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class FileService {
    private File file;

    public FileService(File file) {
        this.file = file;
    }

    private void write(String context) {
        // TODO add some implementations
    }

    private String read() {
        // TODO add some implementations
        return "";
    }
}
