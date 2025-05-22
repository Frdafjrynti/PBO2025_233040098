package Pertemuan9.Latihan;

public class Main {
    public static void main(String[] args) {
        Buah buah = new Buah("Buah Generik", "Hijau", true);
        Apel apel = new Apel("Fuji", "Merah", true, "Malus domestica", true);
        Pisang pisang = new Pisang("Cavendish", "Kuning", true, 15, false);

        // Menampilkan informasi menggunakan metode info
        System.out.println("=== INFORMASI BUAH ===");
        buah.info();

        System.out.println("\n=== INFORMASI APEL ===");
        apel.info();
        apel.kupas();

        System.out.println("\n=== INFORMASI PISANG ===");
        pisang.info();
        pisang.kupasKulit();

        // Mendemonstrasikan perubahan properti
        System.out.println("\n=== SETELAH MODIFIKASI ===");
        apel.setWarna("Hijau");
        apel.setManis(false);
        apel.info();

        pisang.setWarna("Coklat");
        pisang.setMatang(false);
        pisang.info();

        // Mendemonstrasikan metode kupasKulit lagi setelah pisang sudah dikupas
        pisang.kupasKulit();
    }

}
