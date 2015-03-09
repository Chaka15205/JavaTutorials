package com.chaka15205.learn;

public class Main {
    public static void main(String [] args) {
        Tuna tuna = new Tuna();
        System.out.println(tuna.toMilitary());
        tuna.setTime(13, 27, 6);
        System.out.println(tuna.toMilitary());
    }
}