package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TabrizApplication {
    private static final Logger log = LoggerFactory.getLogger(TabrizApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TabrizApplication.class, args);
        log.info("\n Swagger OpenAPI documentation is available at: http://localhost:8383/swagger-ui.html");
    }
}
