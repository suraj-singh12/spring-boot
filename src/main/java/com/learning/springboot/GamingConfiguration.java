package com.learning.springboot;

import com.learning.springboot.game.GameRunner;
import com.learning.springboot.game.GamingConsole;
import com.learning.springboot.game.MarioGame;
import org.springframework.context.annotation.Bean;

public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        return new MarioGame();
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
