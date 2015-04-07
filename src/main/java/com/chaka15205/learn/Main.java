package com.chaka15205.learn;

import java.util.EnumSet;

public class Main {
    public static void main(String [] args) {

        for (Util people : Util.values()) {
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        }
        System.out.println("\n\n");

        for (Util people : EnumSet.range(Util.LEGEIS, Util.FRANKIE2222222)) {
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        }
    }
}