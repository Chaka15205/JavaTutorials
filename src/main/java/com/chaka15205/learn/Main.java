package com.chaka15205.learn;

public class Main {
    public static void main(String [] args) {

        Util util = new Util();
        Util util2 = new Util(5);
        Util util3 = new Util(5, 13);
        Util util4 = new Util(5, 13, 43);

        System.out.printf("%s\n", util.toMilitary());
        System.out.printf("%s\n", util2.toMilitary());
        System.out.printf("%s\n", util3.toMilitary());
        System.out.printf("%s\n", util4.toMilitary());
    }
}