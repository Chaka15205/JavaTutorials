package com.chaka15205.learn;

public class Tuna {

    private int hour;
    private int minute;
    private int second;

    public Tuna() {
        this(0,0,0);
    }
    public Tuna(int h) {
        this(h,0,0);
    }
    public Tuna(int h, int m) {
        this(h,m,0);
    }
    public Tuna(int h, int m, int s) {
        setTime(h,m,s);
    }
    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public void setHour(int h) {

    }
}