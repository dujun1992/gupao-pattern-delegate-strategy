package com.gupao.strategy.payport;

/**
 * Created by DJ on 2019年07月29日 20:09
 **/
public class Test {
    public static void main(String[] args) {
        //省略把商品添加到购物车，再从购物车下单
        //直接从点单开始
        Order order = new Order("1","123456",300);

        //开始支付，选择微信、支付宝、银联、京东

        //这个值是在支付的时候才决定用哪个值
        System.out.println(order.pay(PayStrategy.UNION_PAY));
    }


}
