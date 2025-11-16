package org.example.springgbiuginner.service;

import org.example.springgbiuginner.module.Laptop;
import org.example.springgbiuginner.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    public void addLaptop(Laptop laptop){
        laptopRepository.save(laptop);
    }

    public boolean isForGaming(){
        return true;
    }
}
