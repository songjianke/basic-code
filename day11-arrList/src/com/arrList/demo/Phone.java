package com.arrList.demo;

public class Phone {

    private String bround;
    private int price;


    public Phone() {
    }

    public Phone(String bround, int price) {
        this.bround = bround;
        this.price = price;
    }

    /**
     * 获取
     * @return bround
     */
    public String getBround() {
        return bround;
    }

    /**
     * 设置
     * @param bround
     */
    public void setBround(String bround) {
        this.bround = bround;
    }

    /**
     * 获取
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Phone{bround = " + bround + ", price = " + price + "}";
    }
}
