package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private final User buyer;
    private int orderNumber;


    public Order(int orderNumber, User buyer) {
        this.orderNumber = orderNumber;
        this.buyer = buyer;
    }

    public String confirm(){
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", this.buyer.getBuyerName(), this.buyer.getBuyerPhoneNumber(), this.buyer.getBuyerAddress());
    }
}

