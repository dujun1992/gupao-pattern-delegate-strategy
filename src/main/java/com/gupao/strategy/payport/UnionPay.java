package com.gupao.strategy.payport;

/**
 * Created by DJ on 2019年07月29日 19:57
 **/
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联";
    }

    @Override
    protected double queryBalance(String uid) {
        return 100;
    }
}
