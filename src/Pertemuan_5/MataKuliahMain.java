package Pertemuan_5;

public class MataKuliahMain {
    public static void main(String[] args) {
        // create objek matakuliah
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemograman 1", "A", 3, "saya" );
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemograman 2", "AB", 3);
        MataKuliah mk3 = new MataKuliah("003", "Pemograman Berorientasi Objek", "B", 3);

        // tampil daftar matakuliah
        System.out.println("--- Daftar Mata Kuliah ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        System.out.println("--- Nilai IPK ---");
        // hitung total nilai dan sks
        // rumus hitung ipk
        double nilaiTotal = (mk1.getNilaiIndex() * mk1.getSks()) + (mk2.getNilaiIndex() * mk2.getSks()) + (mk3.getNilaiIndex() * mk3.getSks());
        int totalSKS = mk1.getSks() + mk2.getSks() + mk3.getSks();

        // hindari pembagian nol
//        double ipk = nilaiTotal / totalSKS; // menggunakan ini akan menyebabkan arthmenicException(jika tipe data integer) atau
//        mengghasilkan infinity(jika tipe data double)
        // dalam kasus double, hasilnya bukan langsung error, tapi akan menghasilkan infinity atau nan (not a number), yang
        // bisa menyebabkan hasil  yang tidak dinginkan dalam perrhitungan
        double ipk = 0;
        if (totalSKS > 0) {
            ipk = nilaiTotal / totalSKS;
        } // menggunakan ini untuk mencegah terjadinya error atau hasil yang tidak valid dan bisa menghasilkan infinity jika sks=0

        // tampil ipk dengan format dua angka di belakang koma
        System.out.printf("IPK: %.2f\n", ipk);
    }
}
