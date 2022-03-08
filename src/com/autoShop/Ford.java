package com.autoShop;

/**
 * C. Create a subclass of Car class and name it as Ford. The Ford class has the following
 *     fields and methods
 *
 *     ● int year;
 *     ● int manufacturerDiscount;
 *     ● double getSalePrice(); //From the sale price computed from Car class,subtract
 *       the manufacturer Discount.
 */

/**
 * create a class name as Fort this class extends to super class name as Car
 */
public class Ford extends Car {

    /**
     * variables
     */

    int year;
    int manufacturerDiscount;

    /**
     * Create a constructor name as Ford
     * this is parameterized constructor
     * initializing year and manufacturer discount and calling super method
     * @param speed
     * @param regularPrice
     * @param colour
     * @param year
     * @param manufacturerDiscount
     */

    public Ford(int speed, double regularPrice, String colour, int year, int manufacturerDiscount) {
        super(speed, regularPrice, colour);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    /**
     * create a method name as getSalePrice
     * @return Sale price of sedan after removing manufacturer discount from Sale price computed from Car class
     */
    public double getSalePrice() {

        /**
         * returning Sale price of sedan after removing manufacturer discount from
         * Sale price computed from Car class
         */
        return (super.getSalePrice() - super.getSalePrice() * (manufacturerDiscount / 100d));

    }

}
