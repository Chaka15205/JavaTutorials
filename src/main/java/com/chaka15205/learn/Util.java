package com.chaka15205.learn;

public class Util {
    private String first;
    private String last;
    private static int id = 0;

    public Util(String fn, String ln) {
        first = fn;
        last = ln;
        id++;
        System.out.printf("%s %s, ID Number: %d\n", first, last, id);
    }
}