package com.example.game;

public class FactoryProducer {
    public static GameFactory getFactory(String difficulty) {
        switch (difficulty) {
            case "Easy":
                return new EasyGameFactory();
            case "Hard":
                return new HardGameFactory();
            default:
                throw new IllegalArgumentException("Unknown difficulty level.");
        }
    }
}
