package tehran.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KarajApplication {
    private static final Logger log = LoggerFactory.getLogger(KarajApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(KarajApplication.class, args);
        log.info("\n Swagger OpenAPI documentation is available at: http://localhost:8282/swagger-ui.html");
    }
}
