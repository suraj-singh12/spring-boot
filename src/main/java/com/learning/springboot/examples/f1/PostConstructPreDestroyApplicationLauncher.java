package com.learning.springboot.examples.f1;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready");
    }

    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    @PreDestroy
    public void clean() {
        System.out.println("Resources freed!");
    }
}

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("Some logic using someDependency");
    }
}

@Configuration
@ComponentScan // now spring will do component scan in current file's package by default (com.learning.springboot.examples.a1)
public class PostConstructPreDestroyApplicationLauncher {
    public static void main(String[] args) {

        try(var context =
                    new AnnotationConfigApplicationContext(
                            PostConstructPreDestroyApplicationLauncher.class)) {

        }
    }
}
