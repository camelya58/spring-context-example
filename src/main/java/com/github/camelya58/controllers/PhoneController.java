package com.github.camelya58.controllers;

import com.github.camelya58.models.Phone;
import com.github.camelya58.services.PhoneService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class PhoneController {

    private final PhoneService phoneService;

//    @Qualifier("iphone")
//    public Phone iphone;

    public PhoneController(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @Bean
    public boolean demonstration() {

        phoneService.save(new Phone(1, "Samsung", "SII", 5000));
        System.out.println(phoneService.findAll());

        phoneService.save(new Phone(2, "iPhone", "X", 70000));
        System.out.println(phoneService.findAll());

        return true;
    }
}
