package com.springcore.sterotype;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class AppW
{
    public static void main(String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereoconfig.xml");
        Student student=context.getBean("ob",Student.class);
        System.out.println(student.toString());
        System.out.println(student.hashCode());
//        we get same hashcode because the scope is bydefault singleton
//        to make it porototype we have to use the @Scope("prototype")
        Student student2=context.getBean("ob",Student.class);
        System.out.println(student2.hashCode());
    }
}