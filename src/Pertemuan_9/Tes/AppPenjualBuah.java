package Pertemuan_9.Tes;

public class AppPenjualBuah {
    public static void main(String[] args) {
        TokoBuah tokoBuahSegar = new TokoBuah("Buah Segar Indonesia", "Jl. Mangga No. 123");

        // Membuat berbagai jenis buah
        Pisang pisangCavendish = new Pisang("Cavendish", "Kuning", 18000, 30);
        Mangga manggaHarumManis = new Mangga("Harum Manis", "Hijau-Kuning", 35000, 25);
        Apel apelFuji = new Apel("Fuji", "Merah", 25000, 50);

        // Menambahkan buah ke toko
        tokoBuahSegar.tambahBuah(pisangCavendish);
        tokoBuahSegar.tambahBuah(manggaHarumManis);
        tokoBuahSegar.tambahBuah(apelFuji);

        // Menampilkan inventaris toko
        tokoBuahSegar.tampilkanInventaris();

        // Menjual beberapa buah
        System.out.println("\n=== TRANSAKSI PENJUALAN ===");
        tokoBuahSegar.jualBuah("Apel Fuji", 5);
        tokoBuahSegar.jualBuah("Mangga Harum Manis", 3);

        // Menampilkan inventaris setelah penjualan
        tokoBuahSegar.tampilkanInventaris();

        // Memberi diskon akhir pekan
        System.out.println("\n=== PROGRAM DISKON AKHIR PEKAN ===");
        tokoBuahSegar.diskonSemuaBuah(10);

        // Menampilkan inventaris setelah diskon
        tokoBuahSegar.tampilkanInventaris();

        // Menampilkan detail salah satu buah
        System.out.println("\n=== DETAIL BUAH ===");
        Buah buahDetail = tokoBuahSegar.cariBuah("Stroberi California");
        if (buahDetail != null) {
            buahDetail.info();
        }
    }
}
