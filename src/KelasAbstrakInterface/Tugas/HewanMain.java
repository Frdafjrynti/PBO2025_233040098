package KelasAbstrakInterface.Tugas;

public class HewanMain {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing = new Kucing("Meong", 3, "Persia");

        // Membuat objek Anjing
        Anjing anjing = new Anjing("Buddy", 5, true);

        // Tampilkan informasi Kucing
        System.out.println("=== INFORMASI KUCING ===");
        System.out.println("Jenis: " + kucing.jenisHewan());
        System.out.println(kucing.info());
        System.out.println("Suara: " + kucing.bersuara());

        System.out.println();

        // Tampilkan informasi Anjing
        System.out.println("=== INFORMASI ANJING ===");
        System.out.println("Jenis: " + anjing.jenisHewan());
        System.out.println(anjing.info());
        System.out.println("Suara: " + anjing.bersuara());

        // Polymorphism dengan array of Hewan
        System.out.println("\n=== DAFTAR HEWAN ===");
        Hewan[] daftarHewan = {kucing, anjing};

        for (Hewan hewan : daftarHewan) {
            System.out.println(hewan.jenisHewan() + ": " + hewan.getNama());

            // Menggunakan instanceof untuk mengecek tipe object
            if (hewan instanceof Bunyi) {
                Bunyi hewanBerbunyi = (Bunyi) hewan;
                System.out.println("  Suara: " + hewanBerbunyi.bersuara());
            }
        }
    }
}
