package com.example.game;

public class Application {
    public static void main(String[] args) {
        // Get the game manager instance and configure the game
        GameManager gameManager = GameManager.getInstance();
        gameManager.setCurrentLevel(1);
        gameManager.setDifficulty("Easy");
        gameManager.startGame();

        // Create the factory for the current difficulty
        GameFactory gameFactory = FactoryProducer.getFactory(gameManager.getDifficulty());

        // Create and use weapon and power-up
        Weapon weapon = gameFactory.createWeapon();
        PowerUp powerUp = gameFactory.createPowerUp();
        weapon.use();
        powerUp.apply();

        // Create and use enemy
        EnemyFactory enemyFactory = EnemyFactory.getFactory(gameManager.getDifficulty());
        Enemy enemy = enemyFactory.createEnemy();
        enemy.attack();
    }
}
