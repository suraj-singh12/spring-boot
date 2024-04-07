package com.learning.springboot;

public class GameRunner {
    private final MarioGame game;
    public GameRunner(MarioGame game) {
        this.game = game;
    }
    public void run() {
        System.out.println("Running " + game);
    }
}
