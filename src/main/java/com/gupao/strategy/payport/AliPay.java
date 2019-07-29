package com.gupao.strategy.payport;

/**
 * Created by DJ on 2019年07月29日 19:52
 **/
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
