package com.learning.springboot.examples.d1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component @Lazy
class ClassB {
    private ClassA classA;
    public ClassB(ClassA classA) {
        this.classA = classA;
        System.out.println("Initialized ClassB now");
    }

    public void doSomething() {
        System.out.println("Do something");
    }
}

@Configuration
@ComponentScan // now spring will do component scan in current file's package by default (com.learning.springboot.examples.a1)
public class LazyInitializationContextLauncher {
    public static void main(String[] args) {

        try(var context =
                    new AnnotationConfigApplicationContext(
                            LazyInitializationContextLauncher.class)) {
            System.out.println("Spring Context initialization completed.");
            System.out.println("Some code..");

            context.getBean(ClassB.class).doSomething();
        }
    }
}
