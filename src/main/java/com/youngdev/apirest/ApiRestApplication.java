package com.youngdev.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ApiRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiRestApplication.class, args);
    }
}
