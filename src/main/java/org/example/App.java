/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        int price;
        int quantity;
        int price2;
        int quantity2;
        int price3;
        int quantity3;
        int totalPrice;
        int totalPrice2;
        int totalPrice3;

        /*Creating constant*/
        final double rate = 0.055;

        /*Prompting for price of first item*/
        System.out.println("Enter the price of item 1:");
        price = scan.nextInt();

        /*Prompting for quantity of first item*/
        System.out.println("Enter the quantity of item 1:");
        quantity = scan.nextInt();

        /*Prompting for price of second item*/
        System.out.println("Enter the price of item 2:");
        price2 = scan.nextInt();

        /*Prompting for quantity of second item*/
        System.out.println("Enter the quantity of item 2:");
        quantity2 = scan.nextInt();

        /*Prompting for price of third item*/
        System.out.println("Enter the price of item 3:");
        price3 = scan.nextInt();

        /*Prompting for quantity of third item*/
        System.out.println("Enter the quantity of item 3:");
        quantity3 = scan.nextInt();

        /*Calculating total price based on price of items and quantities of items*/
        totalPrice = price * quantity;
        totalPrice2 = price2 * quantity2;
        totalPrice3 = price3 * quantity3;


        /*Calculating subtotal, tax, and total*/
        double subtotal = totalPrice + totalPrice2 + totalPrice3;
        double tax = (subtotal * rate);
        double total = (subtotal + tax);

        /*Displaying output of subtotal, tax, and total*/
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
    }
}