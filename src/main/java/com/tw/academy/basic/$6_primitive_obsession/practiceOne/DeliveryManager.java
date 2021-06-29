package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private final Adress toAddress;
    private final Adress fromAddress;

    public DeliveryManager(Adress fromAddress, Adress toAddress) {
        this.toAddress = toAddress;
        this.fromAddress = fromAddress;
    }

    public DeliverCenter allocate(){
        if (isEquals() && isSameCity()){
            return DeliverCenter.LOCAL;
        }
        if (isEquals()) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private boolean isSameCity() {
        return toAddress.getCity().equals(fromAddress.getCity());
    }

    private boolean isEquals() {
        return toAddress.getProvince(toAddress.getToAddress()).equals(toAddress.getProvince(fromAddress.getToAddress()));
    }

}
