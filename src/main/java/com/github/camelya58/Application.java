package com.github.camelya58;


import com.github.camelya58.models.Phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class Application {

    public static void main(String[] args) {

        // 1 способ (через файл xml
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Phone phone = (Phone) context.getBean("samsung");
        System.out.println(context.getBean("samsung", Phone.class));
        System.out.println(context.getBean("iPhone", Phone.class));

        System.out.println(context.getBean("iPhone").hashCode());
        System.out.println(context.getBean("iPhone").hashCode());

        // 2 способ (через аннотации @Bean)
        ApplicationContext context2 = new AnnotationConfigApplicationContext(Application.class);
        // если много классов с бинами, то надо указывать класс Application.class, где вешаем аннотацию @ComponentScan
        // если один класс с бинами, то указываем название BeansConfig.class

        System.out.println(context2.getBean("samsung", Phone.class));
        System.out.println(context2.getBean("iphone", Phone.class));

        // 3 способ (через контроллер и аннотации)
        System.out.println(context2.getBean("demonstration"));
    }
}
