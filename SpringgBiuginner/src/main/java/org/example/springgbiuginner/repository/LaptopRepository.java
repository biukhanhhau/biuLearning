package org.example.springgbiuginner.repository;

import org.example.springgbiuginner.module.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop){
        System.out.println("Laptop is connected to Database");
    }
}
