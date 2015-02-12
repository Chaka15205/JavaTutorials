package com.chaka15205.learn;

import java.util.Random;

public class Main {
    public static void main(String args[]) {
        Random r = new Random();
        int num;

        for (int c=1; c<10; c++) {
            num = 1+r.nextInt(6); //1+ adds 1 to make it look like 1-6 instead of 0-5
            System.out.println(num + "\t");
        }
    }
}