package com.example.inventoryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @GetMapping("/isPresent")
    public boolean ispResent(){
        return true;
    }

    @GetMapping("/isNotPresent")
    public boolean isNotpResent(){
        return false;
    }
}
