package Pertemuan9.Tes1;

public class BukuFiksi extends Buku{
    private String genre;

    public BukuFiksi() {
        super(); // Memanggil konstruktor default dari kelas Buku
        this.genre = "Tidak ada genre";
    }

    public BukuFiksi(String judul, String pengarang, int tahunTerbit, String genre) {
        super(judul, pengarang, tahunTerbit); // Memanggil konstruktor dari kelas Buku
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil metode displayInfo() dari kelas Buku
        System.out.println("Genre: " + genre);
        System.out.println("Jenis: Buku Fiksi");
    }
}
