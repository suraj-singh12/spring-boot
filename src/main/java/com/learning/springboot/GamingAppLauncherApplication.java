package com.learning.springboot;
import com.learning.springboot.game.GameRunner;
import com.learning.springboot.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learning.springboot.game")      // now spring will be able to search for components in this package.
public class GamingAppLauncherApplication {
    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
