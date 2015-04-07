package com.chaka15205.learn;

public class Main {
    public static void main(String[] args) {

        Info info[] = new Info[2];
        info[0] = new Ref();
        info[1] = new Util();

        for (int x = 0; x < 2; ++x) {
            info[x].eat();
        }
    }
}