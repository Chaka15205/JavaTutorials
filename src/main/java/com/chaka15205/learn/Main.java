package com.chaka15205.learn;

import java.util.Random;

public class Main {
    public static void main(String args[]) {
        Random rand = new Random();
        int freq[]= new int[7];

        for (int r=1;r<1000;r++) {
            ++freq[1+rand.nextInt(6)];
        }

        System.out.println("Face\tFrequency");

        for (int f = 1;f<freq.length;f++) {
            System.out.println(f + "\t\t" + freq[f]);
        }
    }
}