package br.com.medcheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MedCheckBackendJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedCheckBackendJavaApplication.class, args);
    }
}
