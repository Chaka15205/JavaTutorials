package com.chaka15205.learn;

public class Main {
    public static void main(String args[]) {
        int chaka[]={3,4,5,6,7};
        updateArray(chaka);

        for (int y:chaka) {
            System.out.println(y);
        }
    }

    public static void updateArray(int x[]) {
        for (int c = 0; c<x.length;c++) {
            x[c]+=5;
        }
    }
}