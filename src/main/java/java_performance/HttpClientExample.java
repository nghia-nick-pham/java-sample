package java_performance;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpClientExample {

    // one instance, reuse
    public final CloseableHttpClient httpClient = HttpClients.createDefault();

    public static void main(String[] args) throws Exception {

        HttpClientExample obj = new HttpClientExample();

        try {
            System.out.println("Testing 1 - Send Http GET request");
            obj.sendGet();

//            System.out.println("Testing 2 - Send Http POST request");
//            obj.sendPost();
        } finally {
            obj.close();
        }
    }

    public void close() throws IOException {
        httpClient.close();
    }

    public void sendGet() throws Exception {

//        HttpGet request = new HttpGet("https://www.google.com/search?q=mkyong");
        HttpGet request = new HttpGet("http://10.10.116.31/fr/index.jsp");

        // add request headers
//        request.addHeader("custom-key", "mkyong");
//        request.addHeader(HttpHeaders.USER_AGENT, "Googlebot");

        try (CloseableHttpResponse response = httpClient.execute(request)) {

            // Get HttpResponse Status
            System.out.println(response.getStatusLine().toString());

            HttpEntity entity = response.getEntity();
            Header headers = entity.getContentType();
            System.out.println(headers);

            if (entity != null) {
                // return it as a String
                String result = EntityUtils.toString(entity);
                System.out.println(result);
            }

        }

    }
}
