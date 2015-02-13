package com.chaka15205.learn;

public class Main {
    public static void main(String args[]) {
        int chaka[]={3,4,5,6,7};
        int total=0;

        for (int x: chaka) {
            total += x;
        }

        System.out.println(total);
    }
}