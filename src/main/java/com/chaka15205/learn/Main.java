package com.chaka15205.learn;

public class Main {
    public static void main(String [] args) {
        Util util = new Util(10);

        for (int i = 0; i < 5; i++) {
            util.add();
            System.out.printf("%s", util);
        }
    }
}