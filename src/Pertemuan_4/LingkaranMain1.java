package Pertemuan_4;
// REFERENSI OBJEK

public class LingkaranMain1 {
    public static void main(String[] args) {
        Lingkaran  l1 = new Lingkaran(5); // membuat objek lingkaran dengan jari-jari 5
        Lingkaran  l2 = l1; // l2 mereferensikan ke objek yang sama dengan l1

        System.out.println(l1.getJari2()); // outpul 5
        System.out.println(l2.getJari2()); // output 5

        l2.setJari2(10); // mengubah  jari-jari melalui referensi l2
        System.out.println(l1.getJari2()); // output 10 (karena l1 & l2 mereferensikan objek yang sama)
        System.out.println(l2.getJari2()); // output awal 10 akan berubah menjadi 7
    }
}
