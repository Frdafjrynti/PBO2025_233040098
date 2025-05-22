package Pertemuan4;
// REFERENSI OBJEK NULL

public class LingkaranMain3 {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);

        System.out.println(l1.getJari2()); // 5
        System.out.println(l2.getJari2()); // 5
        System.out.println(l3.getJari2()); // 7

        l2 = null; // l2 tidak mereferensi objek manapun / ke objek lingkaran
        System.out.println(l1.getJari2()); // 5
        if (l2 != null) {
            System.out.println(l2.getJari2()); // tidak dieksekusi karna l2 null
        }
        System.out.println(l3.getJari2()); // 7
    }
}
