package com.example.DemoApp1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@RestController
@RequestMapping("/app1")
public class TestController {

    private final WebClient webClient;

    public TestController(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://demoapp2:8092").build();
    }

    @GetMapping("/sayHello")
    public String sayHello()
    {
        log.info("GET /app1/sayHello");
        return "Hello from app 1";
    }

    @GetMapping("/callDemoApp2")
    public String callDemoApp2()
    {
        log.info("GET /app1/callDemoApp2");
        String response = webClient.get()
                .uri("/app2/sayAdios")
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return response;

    }

}
