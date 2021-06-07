package com.company;

import java.util.Objects;

public class Constable extends Adult{
    protected void heal() {
        System.out.println("I completely healed!, getting back to prior strengths!!");
        this.setStrength( 60);
        this.setHealth (100);
        this.setStamina (60);
        this.setSpeed(20);
        this.setAttackPower(5);
    }
    private String jurisdiction;

    public void arrest(Adult antiSocial) {
        System.out.println("Arresting the criminal  " + antiSocial);
    }

    public Constable(String name, String jurisdiction) {
        super(name, 60, 100, 60, 20, 5);
        this.jurisdiction = jurisdiction;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return Objects.equals(jurisdiction, constable.jurisdiction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jurisdiction);
    }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction='" + jurisdiction +  super.toString() + '\'' +
                '}';
    }
}
