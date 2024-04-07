package com.learning.springboot;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
        var game = new Pacman();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
