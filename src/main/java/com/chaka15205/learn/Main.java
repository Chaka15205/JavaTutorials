package com.chaka15205.learn;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String fn = JOptionPane.showInputDialog("Enter First Number");
        String sn = JOptionPane.showInputDialog("Enter Second Number");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "The sum is: " + sum, fn + " + " + sn, JOptionPane.PLAIN_MESSAGE);
    }
}