package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class Adress {
    private final String toAddress;

    public Adress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    String getCity() {
        String address = getToAddress();
        return address.substring(address.indexOf("Province") + 1, address.indexOf("City"));
    }

    String getProvince() {
        String address = getToAddress();
        return address.substring(0, address.indexOf("Province"));
    }

    boolean isSameCity(Adress fromAddress) {
        return getCity().equals(fromAddress.getCity());
    }

    boolean isSameProvince(Adress fromAddress) {
        return getProvince().equals(fromAddress.getProvince());
    }
}
