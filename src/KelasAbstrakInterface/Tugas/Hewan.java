package KelasAbstrakInterface.Tugas;

abstract class Hewan {
    protected String nama;
    protected int umur;

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

    // Method abstrak yang harus diimplementasikan
    public abstract String jenisHewan();

    // Method konkrit yang bisa diwariskan
    public String info() {
        return "Nama: " + nama + ", Umur: " + umur + " tahun";
    }
}
