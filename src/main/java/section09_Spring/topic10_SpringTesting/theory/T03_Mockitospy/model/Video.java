package section09_Spring.topic10_SpringTesting.theory.T03_Mockitospy.model;

import java.io.InputStream;

public class Video {
    private String title;
    private InputStream content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public InputStream getContent() {
        return content;
    }

    public void setContent(InputStream content) {
        this.content = content;
    }
}
