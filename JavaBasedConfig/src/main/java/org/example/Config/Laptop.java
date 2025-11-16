package org.example.Config;

import org.example.Computer;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Object Laptop is created");
    }

    @Override
    public void code(){
        System.out.println("Laptop is coding...");
    }
}
