package com.chaka15205.learn;

public class Util {
    private String name;
    private Ref birthday;

    public Util(String theName, Ref theDate) {
        name = theName;
        birthday = theDate;
    }

    @Override
    public String toString() {
        return String.format("My name is %s, My birthday is %s", name, birthday);
    }
}