package org.example;

import org.example.Config.Desktop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[    ] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JvaConfig.class);

        Alien alien1 = context.getBean("alien" ,Alien.class);
        System.out.println(alien1.getCom());



        //region Singleton thì duplicate cái này là nhớ
//        Desktop desk1 = context.getBean("desktop" ,Desktop.class);
//        desk1.code();
        //endregion
    }
}
