package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        //region Giải thích
        //Dòng dưới này sẽ chỉ đến file bean.xml Bean.xml sẽ tạo ra tất cả Objects trong nó
        //nên nếu gắn một cái constructor kèm sout thì nó sẽ print ra mà không cần context.getBean();
        //endregion
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Alien a = context.getBean("alien1" ,Alien.class);
        a.code();
        System.out.println( a.getAge());
        System.out.println(a.getName());
        System.out.println(a.getCom());

    }
}
