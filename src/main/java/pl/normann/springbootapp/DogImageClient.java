package pl.normann.springbootapp;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class DogImageClient {

//    @EventListener(ApplicationReadyEvent.class) // zakomentowane do sprawdzenia czy dziala
    public String getDogImage() {

        RestTemplate restTemplate = new RestTemplate();
        JsonNode jsonNode = restTemplate.getForObject("https://random.dog/woof.json", JsonNode.class);
//        System.out.println(jsonNode.get("url"));
        return jsonNode.get("url").asText();
    }
}
