package Pertemuan6;

import Pertemuan5.MataKuliah;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> KartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai( Mahasiswa mahasiswa) {
        super();
        this.mahasiswa = mahasiswa;
        KartuHasilStudi = new ArrayList<KartuHasilStudi>();
        tglCetak = new Date();
    }
    public void HitungIPK(){
        if (KartuHasilStudi.isEmpty()) { // jika khs kosong, ipk diatur ke 0.0 dan pesan peringatan dicetak
//            System.out.println("Tidak ada data KHS yang tersedia.");
            ipk = 0.0;
            return;
        }
        double totalNilai = 0.0;
        int totalSks = 0;

        for (KartuHasilStudi khs : KartuHasilStudi) {
            khs.hitungIPS(); // pastikan ips sudah di hitung
            for (MataKuliah mk : khs.getDaftarMatakuliah()) {
                totalNilai += khs.getIps() * khs.getTotalSks();
                totalSks += khs.getTotalSks();
            }
        }
        if (totalSks != 0) {
            ipk = totalNilai / totalSks;
        } else { // menghindari kesalahan pembagian 0
            ipk = 0.0;
        }
    }
    public void addKHS(KartuHasilStudi khs){
        KartuHasilStudi.add(khs);
    }
    public void display() {
        HitungIPK();
        System.out.println(mahasiswa.display()); // menampilkan informasi mahasiswa
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.printf("IPK: %.2f\n", ipk);
        for (KartuHasilStudi khs : KartuHasilStudi) { // menampilkan daftar khs
            System.out.println(khs.display());
        }
    }
    public Date getTglCetak() {
        return tglCetak;
    }
    public void setTglCetak(Date tglCetak) {
        this.tglCetak = tglCetak;
    }
    public double getIpk() {
        return ipk;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    public List<KartuHasilStudi> getKartuHasilStudi() {
        return KartuHasilStudi;
    }
    public void setKartuHasilStudi(List<KartuHasilStudi> kartuHasilStudi) {
        this.KartuHasilStudi = kartuHasilStudi;
    }
   public Mahasiswa getMahasiswa() {
        return mahasiswa;
   }
   public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
   }
}
