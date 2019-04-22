package com.htuut.design.pattern.creational.prototype;

import java.util.Date;

/**
 * 原型
 */
public class Mail implements Cloneable {

    private String emailName;

    private String emailAddress;

    /**
     * 发送时间
     */
    private Date sendDate;

    /**
     * 操作人
     */
    private String sendPerson;

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getSendPerson() {
        return sendPerson;
    }

    public void setSendPerson(String sendPerson) {
        this.sendPerson = sendPerson;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "emailName='" + emailName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", sendDate=" + sendDate +
                ", sendPerson='" + sendPerson + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
