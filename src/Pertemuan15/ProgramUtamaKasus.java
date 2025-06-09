package Pertemuan15;

import javax.swing.*;

public class ProgramUtamaKasus {
    public static void main(String[] args) {
        try {
            // Mengatur Look and Feel aplikasi agar sesuai dengan default sistem operasi.
            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        } catch (Exception e) { // Jika terjadi error saat mengatur Look and Feel, cetak error-nya ke konsol.
            e.printStackTrace();
        }
        new StudiKasus(); // membuat sebuah objek baru dari kelas StudiKasus.
    }
}
