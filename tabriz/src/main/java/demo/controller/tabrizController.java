package demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import demo.dto.TabrizResponse;

@RestController("/v1/api")

public class tabrizController {

    @GetMapping("/tabriz/{id}")
    public ResponseEntity<TabrizResponse> getTehran(@PathVariable Integer id) {
        System.out.println("get tabriz"+ id);
        TabrizResponse iAmTabriz = new TabrizResponse("I am tabriz");

        return ResponseEntity.ok(iAmTabriz);
    }
}
