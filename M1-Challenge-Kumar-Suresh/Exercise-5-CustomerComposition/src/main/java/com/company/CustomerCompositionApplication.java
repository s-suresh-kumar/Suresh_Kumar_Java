package com.company;

public class CustomerCompositionApplication {
    public static void main(String[] args) {


        Address shippingAddress = new Address(
                "123 AnyStreet",
                "",
                "AnyTown",
                "AS",
                "12345");
        Address billingAddress = shippingAddress;

        Customer customerA = new Customer(
                "Tom",
                "Holland",
                "tom.holland@email.com",
                "123-456-7890",
                shippingAddress,
                billingAddress,
                true);

        System.out.println("customerA = " + customerA);
    }
}