package com.github.camelya58.services;

import com.github.camelya58.models.Phone;

import java.util.List;

public interface PhoneService {

    Phone save(Phone phone);
    List<Phone> findAll();
}
