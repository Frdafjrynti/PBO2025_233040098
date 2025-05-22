package Pertemuan6;

public class Mahasiswa {
    private String NRP, Nama;

    // constructor tanpa parameter
    public Mahasiswa () {
        // TODO Auto-generated custructor stub
    }
    public Mahasiswa(String nrp, String Nama) {
        super();
        NRP = nrp;
        this.Nama = Nama;
    }
    public String display() {
        return "NRP : " + NRP + ", Nama : " + Nama;
    }
    public String getNRP() {
        return NRP;
    }
    public void setNRP(String nrp) {
        NRP = nrp;
    }
    public String getNama() {
        return Nama;
    }
    public void setNama(String nama) {
        this.Nama = nama;
    }
}
