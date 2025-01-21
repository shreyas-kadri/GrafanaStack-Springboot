package com.example.DemoApp2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/app2")
public class TestController {

    @GetMapping("/sayHello")
    public String sayHello()
    {
        log.info("GET /app2/sayHello");
        return "Hello from app 2";
    }

    @GetMapping("/sayAdios")
    public String sayAdios()
    {
        log.info("GET /app2/sayAdios");
        return "Adios from app 2";
    }
}
