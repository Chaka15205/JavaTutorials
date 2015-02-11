package com.chaka15205.learn;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double n1, n2, a;

        System.out.println("Enter First Number");
        n1 = s.nextDouble();
        System.out.println("Enter Second Number");
        n2 = s.nextDouble();
        a = n1 + n2;
        System.out.println("Your Answer Is: " + a);
    }
}
