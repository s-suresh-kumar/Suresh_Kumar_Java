package com.company;

public class RPGInheritancApp {

    public static void main(String[] args) {

        Warrior ww2_warrior = new Warrior(" John Brito");
        Constable headConstable = new Constable(" Dave Hensen", "Gaithersburg, MD");
        Farmer peasantJoe = new Farmer("Joe Cao");

        System.out.println("ww2_warrior: " + ww2_warrior);
        System.out.println("headConstable: " + headConstable);
        System.out.println("peasantJoe: " + peasantJoe);

        System.out.println("headConstable's oldJurisdiction() = " + headConstable.getJurisdiction() );
        headConstable.setName("Rockville, MD");
        System.out.println("headConstable's new Jurisdiction = " + headConstable.getJurisdiction() );

        System.out.println("ww2_warrior's oldHealth = " + ww2_warrior.getHealth() );
        ww2_warrior.decreaseHealth();
        System.out.println("ww2_warrior's new health = " + ww2_warrior.getHealth() );

    }
}
