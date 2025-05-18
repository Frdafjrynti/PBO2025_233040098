package Pertemuan_9.Tes1;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n======= Membuat Objek Buku =======");
        Buku buku1 = new Buku("Java Programming", "James Gosling", 2020);

        // Membuat objek dari kelas BukuFiksi
        System.out.println("\n--- Membuat Objek Buku Fiksi ---");
        BukuFiksi bukuFiksi1 = new BukuFiksi("Harry Potter", "J.K. Rowling", 1997, "Fantasy");
        bukuFiksi1.displayInfo();

        // Membuat objek dari kelas BukuAkademik
        System.out.println("\n--- Membuat Objek Buku Akademik ---");
        BukuAkademik bukuAkademik1 = new BukuAkademik("Algoritma dan Pemrograman", "Rinaldi Munir", 2018, "Ilmu Komputer");
        bukuAkademik1.displayInfo();

        // Mengubah atribut dengan setter
        System.out.println("\n--- Mengubah Atribut Buku Fiksi ---");
        bukuFiksi1.setJudul("Lord of the Rings");
        bukuFiksi1.setPengarang("J.R.R. Tolkien");
        bukuFiksi1.setTahunTerbit(1954);
        bukuFiksi1.setGenre("High Fantasy");
        bukuFiksi1.displayInfo();

        // Mengubah atribut dengan setter
        System.out.println("\n--- Mengubah Atribut Buku Akademik ---");
        bukuAkademik1.setJudul("Kalkulus");
        bukuAkademik1.setPengarang("Purcell");
        bukuAkademik1.setTahunTerbit(2010);
        bukuAkademik1.setBidangStudi("Matematika");
        bukuAkademik1.displayInfo();
    }
}
