package section07_JavaWeb.topic03_WebPractice.theory.T06_GETVsPOSTLivecoding;

import java.util.HashMap;
import java.util.Map;

public class Post {
    private String url;
    private Map<String, Object> body = new HashMap<>();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, Object> getBody() {
        return body;
    }

    public void setBody(Map<String, Object> body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "url='" + url + '\'' +
                ", body=" + body +
                '}';
    }
}
