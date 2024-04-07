package com.learning.springboot.game;

public class PacmanGame implements GamingConsole{
    public void up() {
        System.out.println("up");
    }
    public void down() {
        System.out.println("sit down");
    }
    public void left() {
        System.out.println("go back");
    }
    public void right() {
        System.out.println("Shoot a bullet");
    }
}
