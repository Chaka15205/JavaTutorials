package com.chaka15205.learn;

public class Main {
    public static void main(String [] args) {

        for (Util people : Util.values()) {
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        }
    }
}