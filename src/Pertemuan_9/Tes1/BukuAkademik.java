package Pertemuan_9.Tes1;

public class BukuAkademik extends Buku {
    private String bidangStudi;

    public BukuAkademik() {
        super(); // Memanggil konstruktor default dari kelas Buku
        this.bidangStudi = "Tidak ada bidang studi";
    }

    public BukuAkademik(String judul, String pengarang, int tahunTerbit, String bidangStudi) {
        super(judul, pengarang, tahunTerbit); // Memanggil konstruktor dari kelas Buku
        this.bidangStudi = bidangStudi;
    }

    public String getBidangStudi() {
        return bidangStudi;
    }
    public void setBidangStudi(String bidangStudi) {
        this.bidangStudi = bidangStudi;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil metode displayInfo() dari kelas Buku
        System.out.println("Bidang Studi: " + bidangStudi);
        System.out.println("Jenis: Buku Akademik");
    }
}
