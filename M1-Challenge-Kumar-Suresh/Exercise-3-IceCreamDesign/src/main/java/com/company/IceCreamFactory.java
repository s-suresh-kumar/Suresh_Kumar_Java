package com.company;

import java.util.Date;


import java.util.Objects;

    public class IceCreamFactory {
        //constant
        private final double pricePerOne = 1.99;

        //instance variables/properties
        private ClientAddress clientShippingAddress;
        private ClientAddress clientBillingAddress;
        //IceCream order details
        private int  quantity_tubs; // 1.5 quarts
        private String iceCreamFlavor;
        private double finalpPrice;
        private boolean orderSentToProduction;
        private boolean orderShipped;
        //Order and Shipment dates
        private Date orderDate;
        private Date shippedDate;

        //payment details.
        private boolean paymtCompleted;
        private Date paymtCompltedDate;
        private String paymtRef;


        /* instance methods */
        public void calculatePrice() {
            finalpPrice = quantity_tubs * pricePerOne;
        }
        public void printOrderDetails(){
            System.out.println("Here is the Bill to be mailed to " + this);

        }

        public void sendOrderToProductionLine() {
            if(orderSentToProduction == false) {
                System.out.println("Send instructions to production department about order with " +
                        "order details :" + toString());
                orderSentToProduction = true;
            }
        }


        public void ship() {
            if (orderSentToProduction == false) {
                System.out.println("Order not yet processed. Starting to process order");
                sendOrderToProductionLine();
            } else if (orderShipped == false) {
                Date d1 = new Date();
                setShippedDate(d1);
                orderShipped = true;
                System.out.println("Order Shipped. Order Details: " + this);
            }

        }

        public IceCreamFactory(ClientAddress clientShippingAddress, ClientAddress clientBillingAddress,
                               int quantity_tubs, String iceCreamFlavor,
                               boolean orderSentToProduction, boolean orderShipped, Date orderDate,
                               boolean paymtCompleted, String paymtRef) {
            this.clientShippingAddress = clientShippingAddress;
            this.clientBillingAddress = clientBillingAddress;
            this.quantity_tubs = quantity_tubs;
            this.iceCreamFlavor = iceCreamFlavor;
            this.orderSentToProduction = orderSentToProduction;
            this.orderShipped = orderShipped;
            this.orderDate = orderDate;
            this.finalpPrice = pricePerOne * quantity_tubs;
            this.paymtRef = paymtRef;
        }
//        public IceCreamFactory(ClientAddress clientShippingAddress, ClientAddress clientBillingAddress, int quantity_tubs,
//                               String iceCreamFlavor, double price, boolean orderProcessed,
//                               boolean orderShipped, Date orderDate, Date shippedDate, boolean paymtCompleted,
//                               Date paymtCompltedDate, String paymtRef) {
//            this.clientShippingAddress = clientShippingAddress;
//            this.clientBillingAddress = clientBillingAddress;
//            this.quantity_tubs = quantity_tubs;
//            this.iceCreamFlavor = iceCreamFlavor;
//            this.finalpPrice = price;
//            this.orderProcessed = orderProcessed;
//            this.orderShipped = orderShipped;
//            this.orderDate = orderDate;
//            this.shippedDate = shippedDate;
//            this.paymtCompleted = paymtCompleted;
//            this.paymtCompltedDate = paymtCompltedDate;
//            this.paymtRef = paymtRef;
//        }

        //Getters and Setters
        public double getPricePerOne() {
            return pricePerOne;
        }

        public ClientAddress getClientShippingAddress() {
            return clientShippingAddress;
        }

        public void setClientShippingAddress(ClientAddress clientShippingAddress) {
            this.clientShippingAddress = clientShippingAddress;
        }

        public ClientAddress getClientBillingAddress() {
            return clientBillingAddress;
        }

        public void setClientBillingAddress(ClientAddress clientBillingAddress) {
            this.clientBillingAddress = clientBillingAddress;
        }

        public int getQuantity_tubs() {
            return quantity_tubs;
        }

        public void setQuantity_tubs(int quantity_tubs) {
            this.quantity_tubs = quantity_tubs;
        }

        public String getIceCreamFlavor() {
            return iceCreamFlavor;
        }

        public void setIceCreamFlavor(String iceCreamFlavor) {
            this.iceCreamFlavor = iceCreamFlavor;
        }

        public double getFinalpPrice() {
            return finalpPrice;
        }

        public void setFinalpPrice(double finalpPrice) {
            this.finalpPrice = finalpPrice;
        }

        public boolean isOrderProcessed() {
            return orderSentToProduction;
        }

        public void setOrderProcessed(boolean orderProcessed) {
            this.orderSentToProduction = orderProcessed;
        }

        public boolean isOrderShipped() {
            return orderShipped;
        }

        public void setOrderShipped(boolean orderShipped) {
            this.orderShipped = orderShipped;
        }

        public Date getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(Date orderDate) {
            this.orderDate = orderDate;
        }

        public Date getShippedDate() {
            return shippedDate;
        }

        public void setShippedDate(Date shippedDate) {
            this.shippedDate = shippedDate;
        }

        public boolean isPaymtCompleted() {
            return paymtCompleted;
        }

        public void setPaymtCompleted(boolean paymtCompleted) {
            this.paymtCompleted = paymtCompleted;
        }

        public Date getPaymtCompltedDate() {
            return paymtCompltedDate;
        }

        public void setPaymtCompltedDate(Date paymtCompltedDate) {
            this.paymtCompltedDate = paymtCompltedDate;
        }

        public String getPaymtRef() {
            return paymtRef;
        }

        public void setPaymtRef(String paymtRef) {
            this.paymtRef = paymtRef;
        }
        //hashCode and equals
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            IceCreamFactory that = (IceCreamFactory) o;
            return Double.compare(that.pricePerOne, pricePerOne) == 0
                    && quantity_tubs == that.quantity_tubs && Double.compare(that.finalpPrice, finalpPrice) == 0 &&
                    orderSentToProduction == that.orderSentToProduction && orderShipped == that.orderShipped && paymtCompleted == that.paymtCompleted && Objects.equals(clientShippingAddress, that.clientShippingAddress) && Objects.equals(clientBillingAddress, that.clientBillingAddress) && Objects.equals(iceCreamFlavor, that.iceCreamFlavor) && Objects.equals(orderDate, that.orderDate) && Objects.equals(shippedDate, that.shippedDate) && Objects.equals(paymtCompltedDate, that.paymtCompltedDate) && Objects.equals(paymtRef, that.paymtRef);
        }

        @Override
        public int hashCode() {
            return Objects.hash(pricePerOne, clientShippingAddress, clientBillingAddress, quantity_tubs, iceCreamFlavor, finalpPrice, orderSentToProduction, orderShipped, orderDate, shippedDate, paymtCompleted, paymtCompltedDate, paymtRef);
        }
        // toString
        @Override
        public String toString() {
            return "IceCreamFactory{" +
                    "pricePer=" + pricePerOne +
                    ", ClientShippingAddress=" + clientShippingAddress +
                    ", ClientBillingAddress=" + clientBillingAddress +
                    ", quantity_tubs=" + quantity_tubs +
                    ", iceCreamFlavor='" + iceCreamFlavor + '\'' +
                    ", price=" + finalpPrice +
                    ", orderProcessed=" + orderSentToProduction +
                    ", orderShipped=" + orderShipped +
                    ", orderDate=" + orderDate +
                    ", shippedDate=" + shippedDate +
                    ", paymtCompleted=" + paymtCompleted +
                    ", paymtCompltedDate=" + paymtCompltedDate +
                    ", paymtRef='" + paymtRef + '\'' +
                    '}';
        }
    }
