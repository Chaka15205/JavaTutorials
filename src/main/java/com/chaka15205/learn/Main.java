package com.chaka15205.learn;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int grade, avg, total, count;
        total = 0;
        count = 0;

        while (count < 10) {
            grade = scan.nextInt();
            total = total + grade;
            count++;
        }

        avg = total/10;
        System.out.println("Your average is: " + avg);
    }
}