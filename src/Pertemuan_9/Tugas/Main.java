package Pertemuan_9.Tugas;

public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Generic", "Hitam", 2020);
        Mobil mobil = new Mobil("Toyota", "Merah", 2022, 4, "Bensin");
        Motor motor = new Motor("Honda", "Biru", 2023, 150, "Manual");

        kendaraan.info();

        mobil.info();
        mobil.klakson();

        motor.info();
        motor.rev();

        System.out.println("\n=== SETELAH MODIFIKASI ===");
        mobil.setWarna("Putih");
        mobil.setJumlahPintu(2);
        mobil.info();

        motor.setWarna("Hitam");
        motor.setCc(250);
        motor.info();
    }
}
