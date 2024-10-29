package spring.resttemplate;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {




//        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
//        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
//        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://bull.codixfr.private:22622/liteca-be-LITECA_582/api/authens";
        Map<String, Object> payload = new HashMap<>();
        payload.put("username", "imx");
        payload.put("password", "crx");
        Map<String, Object> resp = restTemplate.postForObject(url, payload, Map.class);


    }
}
