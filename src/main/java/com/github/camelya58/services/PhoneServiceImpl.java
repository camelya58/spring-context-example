package com.github.camelya58.services;

import com.github.camelya58.models.Phone;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    private final List<Phone> phoneRepository;

    public PhoneServiceImpl(List<Phone> phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    public Phone save(Phone phone) {
        phoneRepository.add(phone);
        return phone;
    }

    public List<Phone> findAll() {
        return phoneRepository;
    }
}
