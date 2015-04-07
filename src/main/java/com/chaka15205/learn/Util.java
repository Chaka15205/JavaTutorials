package com.chaka15205.learn;

public class Util {
    private int sum;
    private final int NUMBER;

    public Util(int x) {
        NUMBER = x;
    }
    public void add() {
        sum += NUMBER;
    }

    @Override
    public String toString() {
        return String.format("Sum = to %d\n", sum);
    }
}