package Pertemuan15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldForm3 extends JFrame implements ActionListener {
    private JLabel label;
    private JButton button;
    public HelloWorldForm3() {
        label = new JLabel();
        label.setText("Hello World");
        button = new JButton("Klik Me!");
        button.addActionListener(this); // Menambahkan ActionListener ke button

        setLayout(new GridLayout(2,1));  // Mengatur layout form
        add(label);
        add(button);
        // Inisialisasi properti form
        setTitle("My First Program");
        setVisible(true);
        setSize(300, 200);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Hallo Dunia!");  // Mengubah teks label ketika button diklik
    }
}
