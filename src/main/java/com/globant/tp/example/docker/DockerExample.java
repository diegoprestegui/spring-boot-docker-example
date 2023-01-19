package com.globant.tp.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerExample {
    public static void main(String[] args) {
        SpringApplication.run(DockerExample.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Docker Example";
    }
}