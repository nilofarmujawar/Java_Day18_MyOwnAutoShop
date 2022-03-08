package com.autoShop;

/**
 * D. Create a subclass of Car class and name it as Sedan. The Sedan class has the following
 *    fields and methods.
 *
 *     ● int length;
 *     ● double getSalePrice(); //If length>20 feet, 5% discount, Otherwise, 10% discount.
 */

/**
 * create a subclass name as Sedan this class extends to superclass name as Car
 */
public class Sedan extends Car {

    /**
     * variable
     */

    int length;

    /**
     * create a constructor name as Sedan
     * this is parameterized constructor
     * Here we initializing length and calling super method
     * @param speed
     * @param regularPrice
     * @param colour
     * @param length
     */

    public Sedan(int speed, double regularPrice, String colour, int length) {
        super(speed, regularPrice, colour);
        this.length = length;
    }

    /**
     * create a method name as getSalePrice
     * Here we calculating the Sale price of Sedan
     * @return Sale price of sedan after removing discount
     */

    public double getSalePrice() {
        /**
         * variable
         */
        double discount = 0;

        /**
         * using if else conditional statements
         */
        if (length > 20) {

            /**
             * calculating 5% discount if length>20
             */
            discount = regularPrice * 0.05;

        } else {

            /**
             * calculating 10% discount if length<20
             */

            discount = regularPrice * 0.1;
        }

        /**
         *  returning Sale price of sedan after removing discount
         */
        return regularPrice - discount;
    }

}