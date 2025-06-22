package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TehranApplication {
    private static final Logger log = LoggerFactory.getLogger(TehranApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TehranApplication.class, args);
        log.info("\n Swagger OpenAPI documentation is available at: http://localhost:8181/swagger-ui.html");
    }
}
