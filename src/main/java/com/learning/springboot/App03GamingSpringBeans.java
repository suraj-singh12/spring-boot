package com.learning.springboot;
import com.learning.springboot.game.GameRunner;
import com.learning.springboot.game.GamingConsole;
import com.learning.springboot.game.MarioGame;
import com.learning.springboot.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App03GamingSpringBeans {
    @Bean
    public GamingConsole game() {
        return new MarioGame();
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
