package org.example.springgbiuginner;

import org.example.springgbiuginner.module.Alien;
import org.example.springgbiuginner.module.Laptop;
import org.example.springgbiuginner.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringgBiuginnerApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringgBiuginnerApplication.class, args);
        // context là cái container chứa beans
        Alien obj = context.getBean(Alien.class);
        Laptop laptop = context.getBean(Laptop.class);

        LaptopService laptopService = context.getBean(LaptopService.class);
        laptopService.addLaptop(laptop);
    }

}
