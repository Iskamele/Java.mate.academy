package section07_JavaWeb.topic03_WebPractice.theory.T06_GETVsPOSTLivecoding;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //GET vs POST

        // model: Q7
        // maker: Audi
        // year: 2019

        // http://localhost:8080/cars?model=Q7&maker=Audi&year=2019 --- GET

        // http://localhost:8080/cars --- POST
        Post post = new Post();
        post.setUrl("http://localhost:8080/cars");
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("model", "Q7");
        parameters.put("maker", "Audi");
        parameters.put("year", 2019);
        post.setBody(parameters);

        HttpClient httpClient = new HttpClient();
        httpClient.send(post);

        Get get = new Get("http://localhost:8080/cars");
        get.addParameter("model", "Q7");
        get.addParameter("maker", "Audi");
        get.addParameter("year", String.valueOf(2019));
        httpClient.send(get);
    }
}
