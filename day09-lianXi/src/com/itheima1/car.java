package com.itheima1;

public class car {

    private String bround;
    private double price;
    private String color;


    public car() {
    }

    public car(String bround, double price, String color) {
        this.bround = bround;
        this.price = price;
        this.color = color;
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
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "car{bround = " + bround + ", price = " + price + ", color = " + color + "}";
    }
}
