package org.example.Config;

import org.example.Computer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Desktop implements Computer {
    public Desktop(){
        System.out.println("Object Desktop is created");
    }

    @Override
    public void code(){
        System.out.println("Desktop is Coding...");
    }
}
