package section07_JavaWeb.topic03_WebPractice.theory.T06_GETVsPOSTLivecoding;

public class Get {
    private String url;

    public Get(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void addParameter(String name, String value) {
        url = url + (url.contains("?") ? "&" + name + "=" + value
                : "?" + name + "=" + value);
        // http://addtess/cars?name1=value&name2=value2
    }
}
