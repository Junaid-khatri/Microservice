package com.example.orderservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
@RestController
@RequestMapping("/api/order")
@Slf4j
@RequiredArgsConstructor
public class OrderController {

    private final WebClient.Builder webClientBuilder;

    @GetMapping("/placeOrder")
    public String placeOrder(){
        Boolean result = webClientBuilder.build().get()
                .uri("http://inventoryservice/api/inventory/isPresent")
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();
        log.info("http://inventoryservice/api/inventory/isPresent - {}",result);
        return "Order placed successfully";
    }
}
