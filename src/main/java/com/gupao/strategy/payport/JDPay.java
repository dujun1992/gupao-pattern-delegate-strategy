package com.gupao.strategy.payport;

/**
 * Created by DJ on 2019年07月29日 19:53
 **/
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
