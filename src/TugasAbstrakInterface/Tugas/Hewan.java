package TugasAbstrakInterface.Tugas;

// superclass atau kelas induk bagi berbagai jenis hewan lainnya dalam suatu program
abstract class Hewan {
    protected String nama; //atribut modifier proctected agar bisa diakses langsung oleh subclass
    protected int umur;

    // konstruktor untuk mengininisialisasi objek ddibuat melalui subclass
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // Method abstrak yang harus diimplementasikan (mengembalikan jenis hewan)
    public abstract String jenisHewan();

    // Method konkrit yang bisa diwariskan
    public String info() {
        return "Nama: " + nama + ", Umur: " + umur + " tahun";
    }
}
