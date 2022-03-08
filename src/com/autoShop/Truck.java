package com.autoShop;

/**
 * B. Create a sub class of Car class and name it as Truck. The Truck class has the following
 *     fields and methods.
 *
 *      ● int weight;
 *      ● double getSalePrice(); //If weight>2000,10%discount. Otherwise, 20% discount.
 */

/**
 * class truck extends Super class name as Car
 */
public class Truck extends Car {

    /**
     * variable
     */
    int weight;

    /**
     *  create a constructor name as Truck
     *  this is parameterized constructor
     *  initializing weight calling super method
     * @param speed
     * @param regularPrice
     * @param colour
     * @param weight
     */

    public Truck(int speed, double regularPrice, String colour, int weight) {
        super(speed, regularPrice, colour);
        this.weight = weight;
    }

    /**
     * Here creating a method name as getSalePrice
     * In this method we are calculating the Sale price of Truck
     * @return Sale price of sedan after removing discount
     */
    public double getSalePrice() {

        /**
         * variable
         */
        double discount = 0;

        /**
         * if else conditional statment is used
         */
        if (weight > 2000) {

            /**
             * calculating 10% discount if weight>2000
             */

            discount = regularPrice * 0.1;

        } else {

            /**
             *  calculating 20% discount if weight<2000
             */

            discount = regularPrice * 0.2;
        }

        /**
         *  returning Sale price of sedan after removing discount
         */
        return regularPrice - discount;
    }

}