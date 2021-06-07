package com.company;

import java.util.Objects;

public abstract class Adult {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    // want to force the derived class to implement it with the assumption that as   one heals, that person will go to his initial values
    //And the initial values are different for different sub classes.
    abstract void heal();
    protected void run() {
        System.out.println("current strength = " + this.strength);
        System.out.println("current stamina = " + this.stamina);
        System.out.println("current speed = " + this.speed);
        if (this.strength >0 && this.stamina >0 && this.speed >0) {
            System.out.println("Ran 5 minutes");

            this.strength--;
            this.stamina--;
        }
        else {
            System.out.println("Not able to run ....");
        }
    }

    protected void attack() {
        System.out.println("current strength = " + this.strength);
        System.out.println("current stamina = " + this.stamina);
        System.out.println("current speed = " + this.speed);
        if (this.attackPower > 0)
        System.out.println("Attacked!!! ");
        this.attackPower -=1;
    }

    protected void decreaseHealth() {
        System.out.println("Oh. I am suffering from poor health");
        this.health--;
    }

    protected void increaseStamina() {
        System.out.println("I am refreshed and energised. Got more stamina!!");
        this.stamina++;
    }

    protected void decreaseStamina() {
        System.out.println("I am tired, losing energy. My stamina is dissipating");
        this.stamina--;
    }

    public Adult(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    public Adult() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adult adult = (Adult) o;
        return strength == adult.strength && health == adult.health && stamina == adult.stamina && speed == adult.speed && attackPower == adult.attackPower && Objects.equals(name, adult.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, health, stamina, speed, attackPower);
    }

    @Override
    public String toString() {
        return "Adult{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                '}';
    }
}
