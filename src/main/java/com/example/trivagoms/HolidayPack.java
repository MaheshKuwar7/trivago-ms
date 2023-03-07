package com.example.trivagoms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PublicKey;

@RestController
public class HolidayPack {
    @GetMapping("/MyHoildayPack")
    public String getData() {
        return "Please book your package";
    }

}

