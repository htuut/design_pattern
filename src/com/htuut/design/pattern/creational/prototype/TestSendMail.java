package com.htuut.design.pattern.creational.prototype;

import java.util.Date;

public class TestSendMail {


    public static void main(String[] args) throws CloneNotSupportedException {

        Mail mail = new Mail();
        mail.setSendDate(new Date());
        mail.setSendPerson("张三");

        for (int i = 0; i < 10; i++) {
            //使用克隆不会调用构造方法，直接使用二进制生成新的对象，比构造器快一点
            //浅拷贝：如果属性是引用类型，那么所有克隆出来的对象，都会公用一个（修改其中要给，其他的也会跟着变）
            //深拷贝：相反
            Mail mail1 = (Mail) mail.clone();
            mail1.setEmailName("名字" + i);
            mail1.setEmailAddress("深圳" + i);

            System.out.println(mail1);
        }


    }


}
