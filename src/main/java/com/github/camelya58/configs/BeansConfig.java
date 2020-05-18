package com.github.camelya58.configs;

import com.github.camelya58.models.Phone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BeansConfig {

    @Bean
    @Scope("prototype")
    public Phone iphone() {
        return new Phone(1, "iPhone", "X", 80000);
    }

    @Bean
    public Phone samsung() {
        return new Phone(2, "Samsung", "SII", 10000);
    }
}
