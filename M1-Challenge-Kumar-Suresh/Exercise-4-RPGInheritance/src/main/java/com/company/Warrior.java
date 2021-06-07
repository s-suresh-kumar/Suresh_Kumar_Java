package com.company;

import java.util.Objects;

public class Warrior extends Adult{
    private int shieldStrength;

    protected void heal() {
        System.out.println("I completely healed!, getting back to prior strengths!!");
        this.setStrength( 75);
        this.setHealth (100);
        this.setStamina (100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.setShieldStrength(100);
    }
    public void decreaseShieldStrength() {
        shieldStrength--;
        System.out.println("Hmm... Shielding Strength Reduced");
    }

    public Warrior(String name) {
        super(name,75, 100, 100, 50, 10);
        this.shieldStrength = 100;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Warrior warrior = (Warrior) o;
        return shieldStrength == warrior.shieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shieldStrength);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength + ", " + super.toString() +
                '}';
    }
}
