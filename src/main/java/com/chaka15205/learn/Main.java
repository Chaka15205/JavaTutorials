package com.chaka15205.learn;

public class Main {
    public static void main(String args[]) {
        //A=P(1+R)^N

        double a;
        double p = 8;
        double r = .01;

        for (int d = 1; d <= 30; d++) {
            a = p * Math.pow(1 + r, d);
            System.out.println(d + "\t" + a);
        }
    }
}