package section07_JavaWeb.topic03_WebPractice.theory.T06_GETVsPOSTLivecoding;

public class HttpClient {
    public void send(Post postRequest) {
        System.out.println("Sending post request " + postRequest);
    }

    public void send(Get getRequest) {
        System.out.println("Sending get request " + getRequest.getUrl());
    }
}
