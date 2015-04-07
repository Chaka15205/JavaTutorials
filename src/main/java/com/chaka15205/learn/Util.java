package com.chaka15205.learn;

public class Util {
    private String first;
    private String last;
    private static int members = 0;

    public Util(String fn, String ln) {
        first = fn;
        last = ln;
        members++;
        System.out.printf("%s %s, Members: %d\n", first, last, members);
    }
    public String getFirst() {
        return first;
    }
    public String getLast() {
        return last;
    }
    public static int getMembers() {
        return members;
    }
}