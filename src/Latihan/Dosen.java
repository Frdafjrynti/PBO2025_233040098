package Latihan;

public class Dosen {
        String nama, gelar;

        // Konstruktor tanpa parameter
        public Dosen() {
            this.nama = "";
            this.gelar = "";
        }

        // Konstruktor dengan parameter
        public Dosen(String nama, String gelar) {
            this.nama = nama;
            this.gelar = gelar;
        }

        public String getKodeNama() {
            return this.nama + " - " + this.gelar;
        }

        public String toString() {
            return gelar + "-" + nama;
        }
}
