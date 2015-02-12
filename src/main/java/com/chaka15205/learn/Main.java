package com.chaka15205.learn;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Tuna t = new Tuna();

        System.out.println("Enter Name");

        String temp = s.nextLine();

        t.setName(temp);
        t.saying();
    }
}