package com.htuut.design.pattern.structural.facade;

public class TestGift {


    public static void main(String[] args) {

        GifExchangeService gifExchangeService = new GifExchangeService();
        Gift gift = new Gift("笔记本电脑");
        gifExchangeService.giftExchange(gift);

    }
}
