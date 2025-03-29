package Pertemuan_3;

public class Mahasiswa {
    public String nim;
    public double ipk;
    boolean statusPerwalian;

    // constructor modifikasi
    public Mahasiswa(String nim, double ipk, boolean statusPerwalian) {
        this.nim = nim;
        this.ipk = ipk;
        this.statusPerwalian = statusPerwalian;
    }

    public void Perwalian() {
        statusPerwalian = true;
    }
}
