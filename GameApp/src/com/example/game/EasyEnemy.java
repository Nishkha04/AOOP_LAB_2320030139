package com.example.game;

public class EasyEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Easy enemy attacks with a weak hit.");
    }
}
