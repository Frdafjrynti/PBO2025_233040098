package Pertemuan_5;

public class GelasMain {
    public static void main(String[] args) {
        Gelas g1 = new Gelas("Hitam");
        Gelas g2 = new Gelas("Biru");
        System.out.println("warna g1 sebelumnya: " + g1.getWarna());
        System.out.println("warna g2 sebelumnya: " + g2.getWarna());

        tukarWaarnaGelas(g1, g2);
        System.out.println("warna g1: " + g1.getWarna());
        System.out.println("warna g2: " + g2.getWarna());
    }

    static void tukarWaarnaGelas(Gelas g1, Gelas g2) {
        Gelas gTemp = new Gelas("Temp");
        gTemp.setWarna(g1.getWarna());
        g1.setWarna(g2.getWarna());
        g2.setWarna(gTemp.getWarna());
         /*
        warna g1 disimpan sementara di dalam objek gTemp. kemudian, warna dari g2
        di pindahkan ke g1, dan warna yang di dimpan di gTemp di pindahkan ke g2.
        yang membuat warna keua objek menjadi tertukar.
         */
    }
}
