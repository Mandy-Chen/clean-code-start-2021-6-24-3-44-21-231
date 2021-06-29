package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private final Adress toAddress;
    private final Adress fromAddress;

    public DeliveryManager(Adress fromAddress, Adress toAddress) {
        this.toAddress = toAddress;
        this.fromAddress = fromAddress;
    }

    public DeliverCenter allocate(){
        if (toAddress.getProvince(toAddress.getToAddress()).equals(toAddress.getProvince(fromAddress.getToAddress())) && toAddress.getCity(toAddress.getToAddress()).equals(toAddress.getCity(fromAddress.getToAddress()))){
            return DeliverCenter.LOCAL;
        }
        if (toAddress.getProvince(toAddress.getToAddress()).equals(toAddress.getProvince(fromAddress.getToAddress()))) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

}
