package Pertemuan6;

import Pertemuan5.MataKuliah;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // create objek matakuliah
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemograman 1", "A", 3, "Pak A");
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemograman 2", "A", 3, "Bu B" );
        MataKuliah mk3 = new MataKuliah("003", "Pemograman Berorientasi Objek", "A", 3, "Pak A");
        // create objek KHS
        KartuHasilStudi khs = new KartuHasilStudi("2022");
        khs.addMatakuliah(mk1);
        khs.addMatakuliah(mk2);
        khs.addMatakuliah(mk3);
        //create objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");
        // create objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.display();
    }
}
