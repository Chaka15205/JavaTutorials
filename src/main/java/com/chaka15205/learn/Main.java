package com.chaka15205.learn;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Tuna tuna = new Tuna();

        System.out.println("Enter Your Name.");
        String name = scan.nextLine();

        tuna.simpleMessage(name);
    }
}