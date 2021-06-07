package com.company;

import java.util.Arrays;
import java.util.Objects;

enum flavorType {
    VANILLA,
    CHOCOLATE,
    COOKIESNCREAM,
    MINTCHOCOLATECHIP,
    CHOCOLATECHIPCOOKIEDOUGH,
    BUTTEREDPECAN,
    BIRTHDAYCAKE,
    STRAWBERRY,
    MOOSETRACKS,
    NEOPOLITAN

}

 enum toppingType {
    NO_TOPPING,
    HOT_FUDGE,
    SPRINKLES,
    CARAMEL,
    OREOS,
    PEA_NU_BUTTER_CUPS,
    COKKIE_DOUGH,
    WHIPPED_CREAM,
    HARD_CHOCOLATE_COATING,
    MAX_TOPPINGS
}

 enum coneOrCup {
    CONE,
    CUP
}

 enum cupSize {
    NOT_A_CUP,
    SMALL,
    MEDIUM,
    LARGE,
    MAX_CUP_SIZE

}


public class IceCreamRetailShop {
    private static double scoopPrice = 0.99;
    private static double toppingPrice = 0.50;
    private static double conePrice = 2.99;
    private static double smallCupPrice = 2.99;
    private static double mediumCupPrice = 3.99;
    private static double largeCupPrice = 4.99;

    private flavorType iceCreamFlavor;
    private toppingType[] iceCreamToppings;
    private int numberOfToppings;
    private coneOrCup iceCreamConeOrCup;
    private int scoops;
    private cupSize iceCreamCupSize;
    private double price;


    public IceCreamRetailShop(flavorType iceCreamFlavor, toppingType[] iceCreamToppings, int numberOfToppings,
                              coneOrCup iceCreamConeOrCup) {
        this.iceCreamFlavor = iceCreamFlavor;
        this.iceCreamToppings = iceCreamToppings;
        this.numberOfToppings = numberOfToppings;
        this.iceCreamConeOrCup = iceCreamConeOrCup;
        this.price = this.numberOfToppings * toppingPrice;

        if (iceCreamConeOrCup == coneOrCup.CONE) {

            this.price += conePrice;
        } else {
            if (iceCreamCupSize == cupSize.SMALL)
                this.price += smallCupPrice;
            else if (iceCreamCupSize == cupSize.MEDIUM)
                this.price += mediumCupPrice;
            else if (iceCreamCupSize == cupSize.LARGE)
                this.price += largeCupPrice;
        }

    }

    public IceCreamRetailShop() {
        this.iceCreamConeOrCup = coneOrCup.CONE;
        this.scoops = 0;
        this.numberOfToppings = 0;
    }

    public void addTopping(toppingType topping) {
        int maxToppings = toppingType.MAX_TOPPINGS.ordinal();
        System.out.println("max toppings = " + maxToppings);
        if (this.numberOfToppings < maxToppings) {
            this.iceCreamToppings[this.numberOfToppings] = topping;
            this.numberOfToppings++;
            this.price += toppingPrice;
        }
    }
    /*
    public void addScoops(int scoops) {
        this.price += (scoops * scoopPrice);
    } */

    public void printReceipt( ) {
        System.out.println("Icecream Details :" + this);
        System.out.println("The price of iceCream = " + this.price );
    }

    public cupSize getIceCreamCupSize() {
        return iceCreamCupSize;
    }

    public void setIceCreamCupSize(cupSize iceCreamCupSize) {
        this.iceCreamCupSize = iceCreamCupSize;
    }

    public double getPrice() {
        return price;
    }

    // THis should only be called to override already arrived at price of icecream
    // during promo period or special situations.
    // Normally it is computed whenever scoops added, toppings added, constructor etc.,
    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        this.numberOfToppings = numberOfToppings;
    }

    public flavorType getIceCreamFlavor() {
        return iceCreamFlavor;
    }

    public void setIceCreamFlavor(flavorType iceCreamFlavor) {
        this.iceCreamFlavor = iceCreamFlavor;
    }

    public toppingType[] getIceCreamToppings() {
        return iceCreamToppings;
    }

    public void setIceCreamToppings(toppingType[] iceCreamToppings) {
        this.iceCreamToppings = iceCreamToppings;
    }

    public coneOrCup getIceCreamConeOrCup() {
        return iceCreamConeOrCup;
    }

    public void setIceCreamConeOrCup(coneOrCup iceCreamConeOrCup) {
        this.iceCreamConeOrCup = iceCreamConeOrCup;
        if (this.iceCreamConeOrCup == coneOrCup.CONE)
            this.price += conePrice;
        else
            if (iceCreamCupSize == cupSize.SMALL)
                this.price += smallCupPrice;
            else if (iceCreamCupSize == cupSize.MEDIUM)
                this.price += mediumCupPrice;
            else if (iceCreamCupSize == cupSize.LARGE)
                this.price += largeCupPrice;

    }



    public int getScoops() {
        return scoops;
    }

    public void addScoops(int scoops) {
        if (this.iceCreamConeOrCup != coneOrCup.CUP) {
            this.scoops +=  scoops;
            this.price += scoops *scoopPrice;
        }
        else {
            System.out.println("This is a cup ice cream, scoops can be set only for cones");
        }
    }

    public static double getScoopPrice() {
        return scoopPrice;
    }

    public static void setScoopPrice(double scoopPrice) {
        IceCreamRetailShop.scoopPrice = scoopPrice;
    }

    public static double getToppingPrice() {
        return toppingPrice;
    }

    public static void setToppingPrice(double toppingPrice) {
        IceCreamRetailShop.toppingPrice = toppingPrice;
    }

    public static double getConePrice() {
        return conePrice;
    }

    public static void setConePrice(double conePrice) {
        IceCreamRetailShop.conePrice = conePrice;
    }

    public static double getSmallCupPrice() {
        return smallCupPrice;
    }

    public static void setSmallCupPrice(double smallCupPrice) {
        IceCreamRetailShop.smallCupPrice = smallCupPrice;
    }

    public static double getMediumCupPrice() {
        return mediumCupPrice;
    }

    public static void setMediumCupPrice(double mediumCupPrice) {
        IceCreamRetailShop.mediumCupPrice = mediumCupPrice;
    }

    public static double getLargeCupPrice() {
        return largeCupPrice;
    }

    public static void setLargeCupPrice(double largeCupPrice) {
        IceCreamRetailShop.largeCupPrice = largeCupPrice;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamRetailShop that = (IceCreamRetailShop) o;
        return numberOfToppings == that.numberOfToppings && scoops == that.scoops && Double.compare(that.price, price) == 0 && iceCreamFlavor == that.iceCreamFlavor && Arrays.equals(iceCreamToppings, that.iceCreamToppings) && iceCreamConeOrCup == that.iceCreamConeOrCup && iceCreamCupSize == that.iceCreamCupSize;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(iceCreamFlavor, numberOfToppings, iceCreamConeOrCup, scoops, iceCreamCupSize, price);
        result = 31 * result + Arrays.hashCode(iceCreamToppings);
        return result;
    }

    @Override
    public String toString() {
        return "IceCreamRetailShop{" +
                "iceCreamFlavor=" + iceCreamFlavor +
                ", iceCreamToppings=" + Arrays.toString(iceCreamToppings) +
                ", numberOfToppings=" + numberOfToppings +
                ", iceCreamConeOrCup=" + iceCreamConeOrCup +
                ", scoops=" + scoops +
                ", iceCreamCupSize=" + iceCreamCupSize +
                ", price=" + price +
                '}';
    }
}

