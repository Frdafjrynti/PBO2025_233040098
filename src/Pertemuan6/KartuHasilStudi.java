package Pertemuan6;

import Pertemuan5.MataKuliah;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMatakuliah;

    // constructor
    // menerima parameter semester untuk menginisialisasi data semester dan membuat list kosong
    // untuk menyimpan daftar mata kuliah
    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }
    // menambah mata kuliah kedaftar
    public void addMatakuliah(MataKuliah mk) {
        daftarMatakuliah.add(mk);
    }
    // menampilkan daftar mata kuliah
    public String display() {
        StringBuilder sb = new StringBuilder(); // menampilkan daftar dalam bentuk string menggunakan StringBuilder untuk menyusun informasi dari setiap mk
        sb.append("Semester: ").append(semester).append("\n"); // tambahkan semester
        for (MataKuliah mk : daftarMatakuliah) {
            sb.append(mk.display()); // menampilkan informasi matakuliah termasuk dosen
            sb.append("\n");
        }
//        sb.append("IPS: ").append(String.format("%.2f", ips)).append("\n");
        return sb.toString();
    }
    // menghitung IPS berdasarkan mata kuliah
    public void hitungIPS() {
        if (daftarMatakuliah.isEmpty()) {
//            System.out.println("Matakuliah tidak ditemukan");
            ips = 0.0;
            return;
        }
        double totalNilai = 0.0;
        int totalSks = getTotalSks();

        for (MataKuliah mk : daftarMatakuliah) {
            totalNilai += mk.getNilaiIndex() * mk.getSks();
            //totalSks += mk.getSks();
        }
        if (totalSks != 0) { // jika daftar mk kosong, maka ips diatur menjadi 0.0 dan pesan akan dicetak konsol
            ips = totalNilai / totalSks;
        } else {
            ips = 0.0; // jika tidak ada sks, ips dianggap 0
        }
    }
    //setter & getter untuk mengakses dan memodifikasi nilai atribut
    // mengambil & mengatur
    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public double getIps() {
        return ips;
    }
    public void setIps(double ips) {
        this.ips = ips;
    }
    public List<MataKuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }
    public void setDaftarMatakuliah(List<MataKuliah> daftarMatakuliah) {
        this.daftarMatakuliah = daftarMatakuliah;
    }
    public int getTotalSks() { // mengembalikan nilain bertipe int, yaitu total sks
        int totalSks = 0; // (inisialisasi variable dengan 0) digunakan untuk menjumlahkan seluruh sks dari matakuliah yang ada dalam daftar
        for (MataKuliah mk : daftarMatakuliah) { // melakukan iterasi pada setiap mata kuliah yang tersimpan dalam daftar
            totalSks += mk.getSks(); // menambahkan sks dari setiap mata kuliah ke dalam totalSks
        }
        return totalSks; // mengembalikan total sks setelah seluruh perhitungan selesai
    }
}

