package com.chaka15205.learn;

public class Tuna {
    /**
     * public - Can be accessed by all classes
     * private - Can be accessed by only the withholding class
     */
    private String gn;

    /**
     * void returns nothing
     * @param n
     */
    public void setName(String n) {
        gn = n;
    }

    /**
     * String returns something
     * @return Replace (String) with var type
     */
    public String getName() {
        return gn;
    }
    public void saying() {
        System.out.printf("Your First Girlfriend was %s", getName());
    }
}