package com.cheyipai.model;

/**
 * Created by Administrator on 2016/6/27.
 */
public class UsedCar {
    private String carCode;
    private String brand;
    private int age;
    private String level;

    public UsedCar() {

    }

    public UsedCar(String carCode, String brand, int age, String level) {
        this.carCode = carCode;
        this.brand = brand;
        this.age = age;
        this.level = level;
    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
