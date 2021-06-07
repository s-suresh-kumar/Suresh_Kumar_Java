package com.company;

public class Farmer extends Adult{

    protected void heal() {
        System.out.println("I completely healed!, getting back to prior strengths!!");
        this.setStrength( 76);
        this.setHealth (100);
        this.setStamina (75);
        this.setSpeed(10);
        this.setAttackPower(1);
    }
    protected void plow() {
        System.out.println("Plowing my fields!!");
        this.decreaseStamina();
        this.setStrength(this.getStrength() - 1);

    }
    protected void harvest() {
        System.out.println("Harvesting my fields!!");
        this.decreaseStamina();
        this.setStrength(this.getStrength() - 1);
    }

    public Farmer() {
    }
    public Farmer(String name) {
        super(name,76,100,75,10,1 );
    }


    @Override
    public String toString() {
        return "Farmer{" + super.toString() + "}";
    }
}
