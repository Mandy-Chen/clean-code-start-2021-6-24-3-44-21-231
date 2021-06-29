package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private final Adress toAddress;
    private final Adress fromAddress;

    public DeliveryManager(Adress fromAddress, Adress toAddress) {
        this.toAddress = toAddress;
        this.fromAddress = fromAddress;
    }

    public DeliverCenter allocate(){
        if (isSameProvince() && isSameCity()){
            return DeliverCenter.LOCAL;
        }
        if (isSameProvince()) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private boolean isSameCity() {
        return this.toAddress.isSameCity(this.fromAddress);
    }

    private boolean isSameProvince() {
        return this.toAddress.isSameProvince(this.fromAddress);
    }

}
