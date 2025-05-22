package Pertemuan9.Latihan4;

public class InheritanceMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("1001", "Ade Sukendar", "Bandung");
        System.out.println(mhs.getNrp()+ "-" + mhs.getNama() + "-" + mhs.getAlamat());
    }
}
