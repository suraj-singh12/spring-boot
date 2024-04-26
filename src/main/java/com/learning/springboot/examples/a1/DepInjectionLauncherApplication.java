package com.learning.springboot.examples.a1;
import com.learning.springboot.game.GameRunner;
import com.learning.springboot.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan // now spring will do component scan in current file's package by default (com.learning.springboot.examples.a1)
public class DepInjectionLauncherApplication {

    public static void main(String[] args) {

        try(var context =
                    new AnnotationConfigApplicationContext(
                            DepInjectionLauncherApplication.class)) {

        }
    }
}
