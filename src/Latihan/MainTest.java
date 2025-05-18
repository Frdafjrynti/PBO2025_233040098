package Latihan;

public class MainTest {
        public static void main(String[] args) {
            Dosen hendra = new Dosen("Hendra", "IF001");
            Dosen wanda = new Dosen("Wanda", "IF002");

            Mahasiswa badu = new Mahasiswa("Badu", "123040001", hendra, wanda);
            Mahasiswa tuti = new Mahasiswa("Tuti", "123040002", wanda);

            badu.tampilkanPembimbing();
            tuti.tampilkanPembimbing();
        }
}
