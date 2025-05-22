package Pertemuan12.Tugas1;

public class Main {
    public static void main(String[] args) {
        Gitar gitar = new Gitar("Gitar Akustik");
        System.out.println("== Gitar ==");
        System.out.println("Nama: " + gitar.nama);
        System.out.println("Suara: " + gitar.suara());

        Piano piano = new Piano("Piano Elektrik");
        System.out.println("\n== Piano ==");
        System.out.println("Nama: " + piano.nama);
        System.out.println("Suara: " + piano.suara());
    }
}
