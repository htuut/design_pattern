package com.htuut.design.pattern.structural.facade;

/**
 * 外观模式，又名门面模式
 * 单独写一个类封装业务逻辑 与 客户端进行交互，客户端不需要知道子系统是什么，也不需要知道子系统的调用顺序
 */
public class GifExchangeService {

    //实际项目中使用 Autowired 注入
    private PayService payService = new PayService();
    private QualifyService qualifyService = new QualifyService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(Gift gift) {

        //如果校验通过
        if (qualifyService.isAvailable(gift)) {

            //如果支付成功
            if (payService.pay(gift)) {
                //发送物流
                shippingService.ship(gift);
            }

        }

    }

}
