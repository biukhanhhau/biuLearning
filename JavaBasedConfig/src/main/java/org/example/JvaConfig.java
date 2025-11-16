package org.example;

import org.example.Config.Desktop;
import org.example.Config.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class JvaConfig {

//    @Bean(name = {"bill", "thach"})    Dùng để đặt tên cho Bean, nếu không thì tên mặc định method
//    @Bean
//  @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//    //region Declare một obj với thông số đầu
////    @Bean
////    public Alien alien(){
////        Alien ali = new Alien();
////        ali.setAge(18);
////        ali.setCom(desktop());
////        return ali;}
//     //endregion
//
//    @Bean
//    @Primary //dùng để ưu tiên, nhưng không có giá trị nếu có Qualifier
//    public Laptop laptop(){
//        return new Laptop();
//    }
//
//    @Bean
//    public Alien alien(Computer com){        //@Qualifier("laptop") sử dụng trước Computer để set kết nối với Class
//        Alien ali = new Alien();
//        ali.setAge(18);
//        ali.setCom(com);
//        return ali;
//    }
}
