package Pertemuan15;

import javax.swing.*;

public class HelloWorldForm1 extends JFrame {
    private JLabel label;

    // Konstruktor untuk inisialisasi form dan komponen
    public HelloWorldForm1() {
        label = new JLabel(); // Menambahkan label ke form
        label.setText("Hello World");

        add(label);
        setTitle("My First Program");

        setVisible(true);
        setSize(300, 200);
    }
}
