package Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan 10 lagu
        Lagu[] daftarLagu = new Lagu[10];

        // Inisialisasi 10 lagu ke dalam array
        daftarLagu[0] = new Lagu("Hati-Hati di Jalan", 3.43);
        daftarLagu[1] = new Lagu("Melukis Senja", 4.15);
        daftarLagu[2] = new Lagu("Bintang di Surga", 4.32);
        daftarLagu[3] = new Lagu("Laskar Pelangi", 3.56);
        daftarLagu[4] = new Lagu("Zona Nyaman", 3.18);
        daftarLagu[5] = new Lagu("Sial", 2.59);
        daftarLagu[6] = new Lagu("Tak Segampang Itu", 3.47);
        daftarLagu[7] = new Lagu("Menepi", 4.07);
        daftarLagu[8] = new Lagu("Rumah ke Rumah", 3.28);
        daftarLagu[9] = new Lagu("Bukan Rayuan Gombal", 3.36);

        // Membuat objek podcast
        Podcast p = new Podcast("PODHUB", 50.43);

        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        // Menu utama
        do {
            System.out.println("\n===== APLIKASI PEMUTAR MEDIA =====");
            System.out.println("1. Tampilkan Semua Lagu");
            System.out.println("2. Tampilkan Lagu Favorit");
            System.out.println("3. Putar Lagu");
            System.out.println("4. Tambahkan Lagu ke Favorit");
            System.out.println("5. Hapus Lagu dari Favorit");
            System.out.println("6. Putar Podcast");
            System.out.println("7. Tambahkan Podcast ke Favorit");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");

            try {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline

                switch (pilihan) {
                    case 1:
                        // Menampilkan semua lagu
                        tampilkanDaftarLagu(daftarLagu);
                        break;
                    case 2:
                        // Menampilkan lagu favorit
                        tampilkanLaguFavorit(daftarLagu);
                        break;
                    case 3:
                        // Memutar lagu yang dipilih
                        putarLagu(daftarLagu, scanner);
                        break;
                    case 4:
                        // Menambahkan lagu ke favorit
                        tambahLaguKeFavorit(daftarLagu, scanner);
                        break;
                    case 5:
                        // Menghapus lagu dari favorit
                        hapusLaguDariFavorit(daftarLagu, scanner);
                        break;
                    case 6:
                        // Memutar podcast
                        p.play();
                        p.pause();
                        p.stop();
                        break;
                    case 7:
                        // Menambahkan podcast ke favorit
                        p.tambahKeFavorit();
                        break;
                    case 0:
                        System.out.println("Terima kasih telah menggunakan aplikasi!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                scanner.nextLine(); // Membersihkan input yang salah
                pilihan = -1; // Set pilihan ke nilai tidak valid untuk melanjutkan loop
            }
        } while (pilihan != 0);

        scanner.close();
    }

    // Method untuk menampilkan semua lagu
    private static void tampilkanDaftarLagu(Lagu[] daftarLagu) {
        System.out.println("\n===== DAFTAR LAGU =====");
        for (int i = 0; i < daftarLagu.length; i++) {
            Lagu lagu = daftarLagu[i];
            String statusFavorit = lagu.isFavorite() ? " ♥" : "";  // Menambahkan simbol hati jika favorit
            System.out.println((i+1) + ". " + lagu.judul + " (" + lagu.durasi + " menit)" + statusFavorit);
        }
    }

    // Method untuk menampilkan lagu favorit
    private static void tampilkanLaguFavorit(Lagu[] daftarLagu) {
        System.out.println("\n===== DAFTAR LAGU FAVORIT =====");
        boolean adaFavorit = false;

        for (int i = 0; i < daftarLagu.length; i++) {
            Lagu lagu = daftarLagu[i];
            if (lagu.isFavorite()) {
                System.out.println((i+1) + ". " + lagu.judul + " (" + lagu.durasi + " menit)");
                adaFavorit = true;
            }
        }

        if (!adaFavorit) {
            System.out.println("Belum ada lagu yang ditambahkan ke favorit.");
        }
    }

    // Method untuk memutar lagu yang dipilih
    private static void putarLagu(Lagu[] daftarLagu, Scanner scanner) {
        tampilkanDaftarLagu(daftarLagu);
        System.out.print("\nPilih nomor lagu untuk diputar (1-" + daftarLagu.length + "): ");
        try {
            int nomorLagu = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            if (nomorLagu >= 1 && nomorLagu <= daftarLagu.length) {
                Lagu laguPilihan = daftarLagu[nomorLagu - 1];
                System.out.println();
                laguPilihan.play();

                // Simulasi proses pemutaran
                System.out.println("1. Jeda lagu");
                System.out.println("2. Hentikan lagu");
                System.out.print("Pilihan: ");
                int aksi = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline

                if (aksi == 1) {
                    laguPilihan.pause();
                } else if (aksi == 2) {
                    laguPilihan.stop();
                }
            } else {
                System.out.println("Nomor lagu tidak valid.");
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid: " + e.getMessage());
            scanner.nextLine(); // Membersihkan input yang salah
        }
    }

    // Method untuk menambahkan lagu ke favorit
    private static void tambahLaguKeFavorit(Lagu[] daftarLagu, Scanner scanner) {
        tampilkanDaftarLagu(daftarLagu);
        System.out.print("\nPilih nomor lagu untuk ditambahkan ke favorit (1-" + daftarLagu.length + "): ");
        try {
            int nomorLagu = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            if (nomorLagu >= 1 && nomorLagu <= daftarLagu.length) {
                Lagu laguPilihan = daftarLagu[nomorLagu - 1];

                if (!laguPilihan.isFavorite()) {
                    laguPilihan.tambahKeFavorit();
                } else {
                    System.out.println("Lagu \"" + laguPilihan.judul + "\" sudah ada dalam daftar favorit.");
                }
            } else {
                System.out.println("Nomor lagu tidak valid.");
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid: " + e.getMessage());
            scanner.nextLine(); // Membersihkan input yang salah
        }
    }

    // Method untuk menghapus lagu dari favorit
    private static void hapusLaguDariFavorit(Lagu[] daftarLagu, Scanner scanner) {
        // Cek apakah ada lagu favorit
        boolean adaFavorit = false;
        for (Lagu lagu : daftarLagu) {
            if (lagu.isFavorite()) {
                adaFavorit = true;
                break;
            }
        }

        if (!adaFavorit) {
            System.out.println("\nBelum ada lagu yang ditambahkan ke favorit.");
            return;
        }

        // Tampilkan hanya lagu favorit
        System.out.println("\n===== DAFTAR LAGU FAVORIT =====");
        for (int i = 0; i < daftarLagu.length; i++) {
            if (daftarLagu[i].isFavorite()) {
                System.out.println((i+1) + ". " + daftarLagu[i].judul + " (" + daftarLagu[i].durasi + " menit)");
            }
        }

        System.out.print("\nPilih nomor lagu untuk dihapus dari favorit (1-" + daftarLagu.length + "): ");
        try {
            int nomorLagu = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            if (nomorLagu >= 1 && nomorLagu <= daftarLagu.length) {
                Lagu laguPilihan = daftarLagu[nomorLagu - 1];

                if (laguPilihan.isFavorite()) {
                    laguPilihan.hapusDariFavorit();
                } else {
                    System.out.println("Lagu \"" + laguPilihan.judul + "\" tidak ada dalam daftar favorit.");
                }
            } else {
                System.out.println("Nomor lagu tidak valid.");
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid: " + e.getMessage());
            scanner.nextLine(); // Membersihkan input yang salah
        }
    }
}