package com.luruoyang;

import javax.swing.*;

public class HelloWorld {
    private static void createAndShow(){
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("com.luruoyang.HelloWorld");
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShow();
            }
        });
    }
}
