package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class Adress {
    private final String toAddress;

    public Adress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    String getProvince(String address) {
        return address.substring(0, address.indexOf("Province"));
    }

    String getCity() {
        String address = getToAddress();
        return address.substring(address.indexOf("Province") + 1, address.indexOf("City"));
    }
}
