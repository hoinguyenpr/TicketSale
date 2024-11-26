package com.hoinguyenpr.ticketsale.controller.resource;

import com.hoinguyenpr.ticketsale.application.service.event.EventAppService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@RestController
@RequestMapping("/api")
public class HiController {
    @Autowired
    EventAppService eventAppService;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hi")
    @RateLimiter(name = "backendHi", fallbackMethod = "customFallBack")
    public String hi() {
        return eventAppService.sayHi("Say Hi");
    }

    @GetMapping("/hello")
    @RateLimiter(name = "backendHello", fallbackMethod = "customFallBack")
    public String hello() {
        return eventAppService.sayHi("Say Hello");
    }

    @GetMapping("/product")
    @CircuitBreaker(name = "backendProduct", fallbackMethod = "customFallBackCircuit")
    public String circuitBreaker() {
        Random random = new Random();
        int randomId = random.nextInt(20);
        return restTemplate
                .getForObject("https://fakestoreapi.com/products/" + randomId, String.class);
    }

    public String customFallBack(Throwable throwable) {
        return "To many request";
    }

    public String customFallBackCircuit(Throwable throwable) {
        return "Service unavailable";
    }
}
