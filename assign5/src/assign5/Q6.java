package assign5;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uri="https://httpbin.org/get";
		HttpClient client=HttpClient.newHttpClient();
        HttpRequest req=HttpRequest.newBuilder()
        		.uri(URI.create(uri))
        		.GET()
        		.build();
        try {
        HttpResponse<String> resp = client.send(req,BodyHandlers.ofString());
        System.out.println("Response Headers:"+resp.headers());
        System.out.println("Status code:"+resp.statusCode());
        System.out.println("Response Body:"+resp.body());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
      }

}
