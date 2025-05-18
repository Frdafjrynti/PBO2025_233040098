package Latihan;

public class Mahasiswa {
        String nama, nrp;
        Dosen pembimbing1, pembimbing2;

        // Konstruktor dengan parameter
        public Mahasiswa(String nama, String nrp, Dosen p1, Dosen p2) {
            this.nama = nama;
            this.nrp = nrp;
            this.pembimbing1 = p1;
            this.pembimbing2 = p2;
        }

        public Mahasiswa(String nama, String nrp, Dosen p1) {
            this.nama = nama;
            this.nrp = nrp;
            this.pembimbing1 = p1;
            this.pembimbing2 = null;
        }

        public void tampilkanPembimbing() {
            System.out.print(nrp + " - " + nama + " : pembimbing 1 (" + pembimbing1 + ")");
            if (pembimbing2 != null) {
                System.out.println(" pembimbing 2 (" + pembimbing2 + ")");
            } else {
                System.out.println();
            }
        }
}
