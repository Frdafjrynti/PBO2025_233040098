package Tugas;

public class Lagu extends Media implements Favoritable {
    // Tambahkan atribut untuk menandai apakah lagu favorit atau tidak
    private boolean isFavorite;

    Lagu(String judul, double durasi) {
        super(judul, durasi); // Memanggil konstruktor superclass (Media)
        this.isFavorite = false; // Default: lagu bukan favorit
    }

    // implementasi metode abstrak dari superclass (Media)
    public void play() {
        System.out.println("Memutar lagu: " + judul + ", Durasi: " + durasi + " menit");
    }

    public void pause() {
        System.out.println("Menjeda lagu: " + judul);
    }

    public void stop() {
        System.out.println("Menghentikan lagu: " + judul);
    }

    // implementasi metode asbtrak dari inteface (Favoritable)
    public void tambahKeFavorit() {
        this.isFavorite = true; // Set status favorit menjadi true
        System.out.println("Lagu \"" + judul + "\" telah ditambahkan ke favorit.");
    }

    // Method untuk menghapus dari favorit
    public void hapusDariFavorit() {
        this.isFavorite = false;
        System.out.println("Lagu \"" + judul + "\" telah dihapus dari favorit.");
    }

    // Method untuk cek apakah lagu favorit
    public boolean isFavorite() {
        return this.isFavorite;
    }
}