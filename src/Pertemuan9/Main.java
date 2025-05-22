package Pertemuan9;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Bandung", "Ahmad");
//        System.out.println(mhs.getNama());
//        mhs.setNama("Ahmad");
        System.out.println(mhs.getAlamat());
        System.out.println(mhs.getNama());
        System.out.println(mhs.nrp);
        mhs.kerja();
    }
}
