package Pertemuan9.Tes;

class TokoBuah {
    private String namaToko;
    private String alamat;
    private Buah[] daftarBuah;
    private int jumlahBuah;
    private static final int KapasitasMax = 100;

    public TokoBuah(String namaToko, String alamat) {
        this.namaToko = namaToko;
        this.alamat = alamat;
        this.daftarBuah = new Buah[KapasitasMax];
        this.jumlahBuah = 0;
    }
    // menambah buah ke investor
    public void tambahBuah(Buah buah) {
        if (jumlahBuah < KapasitasMax) {
            daftarBuah[jumlahBuah] = buah;
            jumlahBuah++;
            System.out.println(buah.getNama() + " berhasil ditambahkan ke inventaris.");
        } else {
            System.out.println("Inventaris penuh! Tidak bisa menambah buah baru.");
        }
    }
    // mencari buah berdasarkan nama
    public Buah cariBuah(String nama) {
        for (int i = 0; i < jumlahBuah; i++) {
            if (daftarBuah[i].getNama().equals(nama)) {
                return daftarBuah[i];
            }
        }
        return null;
    }
    // menampilkan seluruh inventaris
    public void tampilkanInventaris() {
        System.out.println("\n==== Inventaris " + namaToko.toUpperCase() + " ====");
        System.out.println("Alamat: " + alamat);
        System.out.println("Jumlah Jenis Buah: " + jumlahBuah);

        if (jumlahBuah == 0) {
            System.out.println("Inventaris is empty!");
            return;
        }
        double total = 0;
        for (int i = 0; i < jumlahBuah; i++) {
            System.out.println("\n" + (i + 1) + ". " + daftarBuah[i].getNama());
            System.out.println(" Stok: " + daftarBuah[i].getStok() + " " + daftarBuah[i].getJenisJual());
            System.out.println(" Harga: Rp." + daftarBuah[i].getHarga() + " per" + daftarBuah[i].getJenisJual());
            double nilai = daftarBuah[i].hitungNilaiTotal();
            System.out.println(" Nilai Total: Rp." + nilai);
            total += nilai;
        }
        System.out.println("\nTotal Nilai Inventaris: Rp." + total);
        System.out.println("======================");
    }
    // menjual buah
    public void jualBuah(String nama, double jumlah) {
        Buah buah = cariBuah(nama);
        if (buah != null) {
            buah.jual(jumlah);
        } else {
            System.out.println("Buah " + nama + " tidak ditemukan dalam inventaris!");
        }
    }
    // memberi diskon pada semua buah
    public void diskonSemuaBuah(double persentase) {
        System.out.println("Menerapkan diskon " + persentase + "% untuk semua buah...");
        for (int i = 0; i < jumlahBuah; i++) {
            daftarBuah[i].diskon(persentase);
        }
    }
}
