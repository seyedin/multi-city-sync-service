package tehran.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tehran.demo.dto.KarajResponse;

@RestController("/v1/api")

public class karajController {

    @GetMapping("/karaj/{id}")
    public ResponseEntity<KarajResponse> getTehran(@PathVariable Integer id) {
//        throw new Exception("exception");
        System.out.println("get karaj"+ id);
        KarajResponse iAmKaraj = new KarajResponse("I am karaj");
        return ResponseEntity.ok(iAmKaraj);
    }
}
