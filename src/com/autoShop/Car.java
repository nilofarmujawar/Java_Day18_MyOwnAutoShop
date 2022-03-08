package com.autoShop;

/**
 *  A. Create a super class called Car. The Car class has the following fields and methods.
 *
 *      ● int speed;
 *      ● double regularPrice;
 *      ● String color;
 *      ● double getSalePrice();
 */

/**
 * create a super class name as Car
 */
public class Car {

    /**
     * variables
     */
    int speed;
    double regularPrice;
    String colour;

    /**
     * Create a constructor name as Car.This is parameterized constructor
     * initializing speed,regular price and colour
     * @param speed
     * @param regularPrice
     * @param colour
     */
    public Car(int speed, double regularPrice, String colour) {
        super();
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.colour = colour;
    }

    /**
     * Create a method name as getSalePrice
     * In this method we calculating the Sale price of Car
     * @return sale price of car
     */
    public double getSalePrice() {
        return regularPrice;		 // returning Sale price of Car
    }

}