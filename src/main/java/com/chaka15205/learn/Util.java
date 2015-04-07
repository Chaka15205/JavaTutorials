package com.chaka15205.learn;

import javax.swing.*;
import java.awt.*;

public class Util extends JFrame {

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    public Util() {
        super("User Login");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        add(item1);
        item2 = new JTextField("Enter Text Here");
        add(item2);
        item3 = new JTextField("Uneditable", 20);
        item3.setEditable(false);
        add(item3);
        passwordField = new JPasswordField("mypassword");
        add(passwordField);
    }
}