package com.autoShop;

/**
 * E. Create MyOwnAutoShop class which contains the main() method. Perform the following
 *    within the main() method.
 *
 *     ● Create an instance of Sedan class and initialize all the fields with appropriate
 *       values. Use super(...) method in the constructor for initializing the fields of the
 *       superclass.
 *
 *     ● Create two instances of the Ford class and initialize all the fields with appropriate
 *       values. Use super(...) method in the constructor for initializing the fields of the
 *       super class.
 *
 *     ● Create an instance of Car class and initialize all the fields with appropriate
 *       values. Display the sale prices of all instance.
 */

/**
 * create a main class name as MyOwnShop
 */
public class MyOwnAutoShop {

    /**
     * create a main method.all program execute in main method.
     */

    public static void main(String[] args) {

        /**
         * 1st print welcome msg
         */
        System.out.println("***Welcome to My Own Auto Shop program***");

        /**
         *  creating instance of Sedan class
         */
        Sedan sedan = new Sedan(78, 40000, "Black", 25);
        System.out.println("\nSale price of sedan : " + sedan.getSalePrice());

        /**
         *  creating instance of Ford class
         */

        Ford ford1 = new Ford(74, 50000, "Red", 2015, 10);
        System.out.println("\nSale price of ford1 : " + ford1.getSalePrice());

        /**
         *  creating instance of Ford class
         */
        Ford ford2 = new Ford(81, 75000, "Green", 2019, 12);
        System.out.println("\nSale price of ford2 : " + ford2.getSalePrice());

        /**
         * creating instance of Car class
         */
        Car car = new Car(85, 70000, "White");
        System.out.println("\nSale price of car : " + car.getSalePrice());

    }

}

