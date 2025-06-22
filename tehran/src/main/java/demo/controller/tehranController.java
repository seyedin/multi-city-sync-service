package demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import demo.dto.TehranResponse;

@RestController
@RequestMapping("/v1/api")
public class tehranController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/tehran/{id}")
    public ResponseEntity<TehranResponse> getTehran(@PathVariable Integer id) {
        System.out.println("get tehran " + id);
        String tabriz = callTabrizExternalApi();
        String karaj = callKarajExternalApi();
        String message = "I am Tehran. " + tabriz + " " + karaj;
        TehranResponse resp = new TehranResponse(message);
        return ResponseEntity.ok(resp);
    }

    public String callTabrizExternalApi() {
        String url = "http://localhost:8383/tabriz/1";
        return restTemplate.getForObject(url, String.class);
    }

    public String callKarajExternalApi() {
        String url = "http://localhost:8282/karaj/1";
        return restTemplate.getForObject(url, String.class);
    }
}
