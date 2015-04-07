package com.chaka15205.learn;

public enum Util {
    CHAKA("Developer", "19"),
    LEGEIS("Nub", "24"),
    PRO_JELLYFISH("Fool", "17");

    private final String desc;
    private final String year;

    Util(String description, String age) {
        desc = description;
        year = age;
    }

    public String getDesc() {
        return desc;
    }
    public String getYear() {
        return year;
    }
}