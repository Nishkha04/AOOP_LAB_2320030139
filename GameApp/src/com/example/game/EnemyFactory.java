package com.example.game;

public abstract class EnemyFactory {
    public abstract Enemy createEnemy();

    public static EnemyFactory getFactory(String difficulty) {
        switch (difficulty) {
            case "Easy":
                return new EasyEnemyFactory();
            case "Hard":
                return new HardEnemyFactory();
            default:
                throw new IllegalArgumentException("Unknown difficulty level.");
        }
    }
}

class EasyEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new EasyEnemy();
    }
}

class HardEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new HardEnemy();
    }
}
