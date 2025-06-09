package Pertemuan15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudiKasus extends JFrame implements ActionListener {
    private JTextField textField1, textField2;
    private JButton buttonTambah;
    private JLabel label1, label2;

    // Konstruktor untuk inisialisasi form dan komponen
    public StudiKasus() {
        // Membuat komponen
        label1 = new JLabel("Angka Pertama:");
        label2 = new JLabel("Angka Kedua:");
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        buttonTambah = new JButton("Jumlahkan");

        // Menambahkan ActionListener ke button
        buttonTambah.addActionListener(this);

        // Mengatur layout form
        setLayout(new GridLayout(3, 2, 10, 10));

        // Menambahkan komponen ke form
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(new JLabel("")); // Empty cell
        add(buttonTambah);

        // Inisialisasi properti form
        setTitle("Program Penjumlahan");
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Posisi form di tengah layar
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonTambah) {
            try {
                // Mengambil nilai dari textfield
                String input1 = textField1.getText();
                String input2 = textField2.getText();

                // Validasi input kosong
                if (input1.isEmpty() || input2.isEmpty()) {
                    JOptionPane.showMessageDialog(this,
                            "Mohon isi kedua angka!",
                            "Input Kosong",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Konversi string ke double
                double angka1 = Double.parseDouble(input1);
                double angka2 = Double.parseDouble(input2);

                // Melakukan penjumlahan
                double hasil = angka1 + angka2;

                String message;

                // Cek apakah hasilnya bilangan bulat
                if (hasil % 1 == 0) {
                    // Jika ya, tampilkan sebagai integer (tanpa koma)
                    message = String.format("Hasil Penjumlahan: %d", (long) hasil);
                } else {
                    // Jika tidak, tampilkan sebagai desimal
                    message = String.format("Hasil Penjumlahan: %s", hasil);
                }

                JOptionPane.showMessageDialog(this,
                        message,
                        "Hasil Penjumlahan",
                        JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException ex) {
                // Menangani error jika input bukan angka
                JOptionPane.showMessageDialog(this,
                        "Mohon masukkan angka yang valid!",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
