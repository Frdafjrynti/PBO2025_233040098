package Pertemuan_4;
// REFERENSI OBJEK DENGAN 3 VARIABLE

public class LingkaranMain2 {
    public static void main(String[] args) {
        Lingkaran  l1 = new Lingkaran(5); // membuat objek lingkaran dengan jari-jari 5
        Lingkaran  l2 = l1; // l2 mereferensikan ke objek yang sama dengan l1
        Lingkaran  l3 = new Lingkaran(7);

        System.out.println(l1.getJari2()); // outpul 5
        System.out.println(l2.getJari2()); // output 5
        System.out.println(l3.getJari2()); // output 7

        l2 = l3; // l2 mereferensikan objek yang sama dengan l3
        System.out.println(l1.getJari2()); // output 5
        System.out.println(l2.getJari2()); // output 7
        System.out.println(l3.getJari2()); // output 7
    }
}
