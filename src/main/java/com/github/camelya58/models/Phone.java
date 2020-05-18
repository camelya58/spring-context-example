package com.github.camelya58.models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    private int id;
    private String brand;
    private String model;
    private double price;
}
