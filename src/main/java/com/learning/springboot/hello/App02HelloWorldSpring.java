package com.learning.springboot.hello;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        // 1. Launch a Spring ContextApp01GamingBasicJava
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {  // try with resources
            // 2. Configure the things we want spring to manage - @Configuration
            // HelloWorldConfiguration - @Configuration
            // name - @Bean

            // Retrieving Beans managed by spring (using name)
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2usingMethodCall"));
            System.out.println(context.getBean("person3Parameters"));

            System.out.println(context.getBean("userAddress"));
            // Retrieving Beans managed by spring (using type)
            System.out.println(context.getBean(Address.class));
        }
    }
}
