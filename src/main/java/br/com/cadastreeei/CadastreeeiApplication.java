package br.com.cadastreeei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CadastreeeiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CadastreeeiApplication.class, args);
    }
}