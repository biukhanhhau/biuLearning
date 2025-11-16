package org.example.springgbiuginner.module;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class Desktop implements Computer{
    @Override
    public void code(){
        System.out.println("Desktop is coding....");
    }
}
