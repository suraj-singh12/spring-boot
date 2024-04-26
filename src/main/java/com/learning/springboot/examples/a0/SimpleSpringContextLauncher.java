package com.learning.springboot.examples.a0;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan // now spring will do component scan in current file's package by default (com.learning.springboot.examples.a1)
public class SimpleSpringContextLauncher {
    public static void main(String[] args) {

        try(var context =
                    new AnnotationConfigApplicationContext(
                            SimpleSpringContextLauncher.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}
