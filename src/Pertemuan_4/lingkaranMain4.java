package Pertemuan_4;
//PARAMETER FUNGSI

public class lingkaranMain4 {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5); // membuat objek lingkaran dengan jari-jari 5
        Lingkaran l2 = l1; // l2 mmereferensi objek yang sama dengan l1

        System.out.println(l1.getJari2()); // 5
        System.out.println(l2.getJari2()); // 5

        ubahJari2(l2); //mengubah jari-jari melalui parameter objek

        System.out.println(l1.getJari2()); // 4 (berubah karna referensi yang sama)
        System.out.println(l2.getJari2()); // 4
    }
    public static void ubahJari2(Lingkaran obj) {
        obj.setJari2(4); // mengubah atribut objek yang direferensikan
    }
}
