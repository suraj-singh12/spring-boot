package com.learning.springboot.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component @Qualifier("superContraGameQualifier")
public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("super up");
    }
    public void down() {
        System.out.println("super down");
    }
    public void left() {
        System.out.println("super left");
    }
    public void right() {
        System.out.println("super right");
    }
}
