package com.example.demojenkinsdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoJenkinsDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJenkinsDockerApplication.class, args);
    }

    @GetMapping("/test")
    public String sowMsg() {
        return "I am from jenkins docker pipeline project";
    }

}
