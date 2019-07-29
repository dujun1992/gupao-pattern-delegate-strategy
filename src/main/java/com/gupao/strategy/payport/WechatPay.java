package com.gupao.strategy.payport;

/**
 * Created by DJ on 2019年07月29日 19:58
 **/
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信";
    }

    @Override
    protected double queryBalance(String uid) {
        return 250;
    }
}
