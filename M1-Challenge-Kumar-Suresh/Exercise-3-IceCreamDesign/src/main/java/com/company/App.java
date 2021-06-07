package com.company;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        toppingType toppings[] = {
                toppingType.NO_TOPPING,
                toppingType.NO_TOPPING,
                toppingType.NO_TOPPING,
                toppingType.NO_TOPPING,
                toppingType.NO_TOPPING,
                toppingType.NO_TOPPING,
                toppingType.NO_TOPPING,
                toppingType.NO_TOPPING,
                toppingType.NO_TOPPING};
        IceCreamRetailShop iceCreamPOS = new IceCreamRetailShop(
                flavorType.BIRTHDAYCAKE,
                toppings,
                0,
                coneOrCup.CONE
                );
        iceCreamPOS.addTopping(toppingType.CARAMEL);
        iceCreamPOS.addScoops(3);
        iceCreamPOS.printReceipt();
        iceCreamPOS.addTopping(toppingType.SPRINKLES);
        iceCreamPOS.printReceipt();

        IceCreamFactory iceCreamFactory = new IceCreamFactory(
                new ClientAddress("abc company","123 abc street",
                "","abc town","ab","22222"),
                new ClientAddress("abc company","123 abc street",
                        "","abc town","ab","22222"), 5000, "VANITLLA",
                false, false, new Date(),false,"");

        iceCreamFactory.sendOrderToProductionLine();
        iceCreamFactory.ship();
        iceCreamFactory.printOrderDetails();

    }
}
