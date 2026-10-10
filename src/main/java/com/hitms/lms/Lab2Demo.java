package com.hitms.lms;

public class Lab2Demo {
    public static void main(String[] args) {
        System.out.println("Area: " + AreaCalculator.calculateArea(5, 3));
        double[] prices = {10, 20, 30, 40};
        System.out.println("Total: " + PriceUtils.total(prices));
        System.out.println("Average: " + PriceUtils.average(prices));
    }
}
