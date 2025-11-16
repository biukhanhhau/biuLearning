package org.example.springgbiuginner.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("24")
    private int age;
    Computer com;

    public void code(){
        com.code();
    }

    public Computer getCom() {
        return com;
    }
    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
