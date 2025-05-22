package Pertemuan14;

// final pada varibel
public class ContohFinal {
    public static void main(String[] args) {
        // Final pada variabel primitif - nilai tidak bisa diubah
        final int NILAI_MAX = 100; // Konstanta lokal
        System.out.println("Nilai maksimum: " + NILAI_MAX);

        // NILAI_MAX = 200; // Error! Tidak bisa mengubah nilai final

        // Final pada variabel objek - reference tidak bisa diubah, tapi isi objek bisa
        final StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // DIPERBOLEHKAN: mengubah isi objek melalui method
        System.out.println("StringBuilder: " + sb.toString());

        // sb = new StringBuilder("New"); // COMPILE ERROR! Reference final tidak bisa di-reassign

        /*
         * - Final pada primitif = nilai tidak bisa diubah
         * - Final pada objek = reference tidak bisa diubah, tapi state objek masih bisa dimodifikasi
         */
    }
}
