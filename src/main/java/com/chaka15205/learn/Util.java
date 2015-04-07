package com.chaka15205.learn;

import javax.swing.*;
import java.awt.*;

public class Util extends JFrame {
    private JLabel item1;

    public Util() {
        super("The Great GUI of Greatness");
        setLayout(new FlowLayout());

        item1 = new JLabel("I am a label");
        item1.setToolTipText("Hi? I am text?");
        add(item1);
    }
}