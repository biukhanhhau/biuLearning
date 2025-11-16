package org.example.springgbiuginner.module;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    @Override
    public void code(){
        System.out.println("Laptop is coding..");
    }
}
