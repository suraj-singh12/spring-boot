package com.learning.springboot.examples.a1;
import com.learning.springboot.game.GameRunner;
import com.learning.springboot.game.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class MyBussinessClass {
      // Field Injection
//    @Autowired
//    private Dependency1 dependency1;
//
//    @Autowired
//    private Dependency2 dependency2;

    private  Dependency1 dependency1;
    private Dependency2 dependency2;

//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        this.dependency1 = dependency1;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        this.dependency2 = dependency2;
//    }

//    @Autowired
    public MyBussinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("-> Constructor injection MyBusinessClass");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}


@Configuration
@ComponentScan // now spring will do component scan in current file's package by default (com.learning.springboot.examples.a1)
public class DepInjectionLauncherApplication {
    public static void main(String[] args) {

        try(var context =
                    new AnnotationConfigApplicationContext(
                            DepInjectionLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
            System.out.println(context.getBean(MyBussinessClass.class).toString());
        }
    }
}
