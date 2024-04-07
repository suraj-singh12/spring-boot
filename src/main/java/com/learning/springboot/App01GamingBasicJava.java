package com.learning.springboot;
import com.learning.springboot.game.GameRunner;
import com.learning.springboot.game.SuperContraGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new PacmanGame();
        var game = new SuperContraGame();       // 1. object creation
        var gameRunner = new GameRunner(game);
                        // 2. object creation + wiring of dependency
                        // Game is a dependency of GameRunner class
        gameRunner.run();
    }
}
