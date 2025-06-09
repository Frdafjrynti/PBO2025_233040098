package Pertemuan15;

import javax.swing.*;

public class HelloWorldFrom2 extends JFrame {
    private JLabel label;

    public HelloWorldFrom2() {
        label = new JLabel();
        label.setText("Hello World");

        add(label);
        // Inisialisasi properti form (tanpa setVisible
        setTitle("My First Program");

        setVisible(true); // Perhatikan: setVisible() tidak dipanggil di konstruktor
        setSize(300, 200);
    }
}
