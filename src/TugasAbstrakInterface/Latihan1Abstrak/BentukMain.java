package TugasAbstrakInterface.Latihan1Abstrak;

public class BentukMain {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("== Lingkaran ==");
        System.out.println("jari2: " + lingkaran.jari2);
        System.out.println("luas:" + lingkaran.luas());

        Tabung tabung = new Tabung(10, 5);
        System.out.println("== Tabung ==");
        System.out.println("jari2: " + tabung.jari2 + ", Tinggi:" + tabung.getTinggi());
        System.out.println("luas:" + tabung.luas());
    }
}
