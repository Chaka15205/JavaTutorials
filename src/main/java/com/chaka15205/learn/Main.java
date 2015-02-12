package com.chaka15205.learn;

public class Main {
    public static void main(String args[]) {
        int age = 60;

        if (age < 50) {
            System.out.println("Your Are Young.");
        } else {
            System.out.println("Your Are Old.");
            if (age > 75) {
                System.out.println("You Are Really Old.");
            } else {
                System.out.println("Don't worry you aren't really that old.");
            }
        }
    }
}