package com.chaka15205.learn;

public class Main {
    public static void main(String [] args) {
        Ref ref = new Ref(4, 5, 6);
        Util util = new Util("Chris", ref);

        System.out.println(util);
    }
}