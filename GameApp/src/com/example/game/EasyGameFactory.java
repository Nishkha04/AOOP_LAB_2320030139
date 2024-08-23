package com.example.game;

public class EasyGameFactory implements GameFactory {
    @Override
    public Weapon createWeapon() {
        return new EasyWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new EasyPowerUp();
    }
}
