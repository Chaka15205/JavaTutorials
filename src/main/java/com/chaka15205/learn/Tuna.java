package com.chaka15205.learn;

public class Tuna {
    private String gn;

    public Tuna(String n) {
        gn = n;
    }

    public void setName(String n) {
        gn = n;
    }
    public String getName() {
        return gn;
    }
    public void saying() {
        System.out.printf("Your First Girlfriend was %s \n", getName());
    }
}