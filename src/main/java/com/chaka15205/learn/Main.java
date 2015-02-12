package com.chaka15205.learn;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int age;
        age = 7;

        switch (age) {
            case 1:
                System.out.println("You Can Crawl.");
                break;
            case 2:
                System.out.println("You Can Talk.");
                break;
            case 3:
                System.out.println("You Can get in trouble.");
                break;
            default:
                System.out.println("ERROR: Invalid Age");
                break;
        }
    }
}
