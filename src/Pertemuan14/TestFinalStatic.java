package Pertemuan14;

public class TestFinalStatic {
    public static void main(String[] args) {
        System.out.println("=== TESTING KEYWORD FINAL DAN STATIC ===\n");

        // Test final variable
        System.out.println("1. Testing Final Variable:");
        ContohFinal.main(new String[]{});

        System.out.println("\n2. Testing Final Method:");
        Induk induk = new Induk();
        Anak anak = new Anak();
        induk.tampilkanPesan();
        anak.tampilkanPesan(); // Memanggil method final dari parent
        induk.methodBiasa();
        anak.methodBiasa(); // Method yang di-override

        System.out.println("\n3. Testing Final Class:");
        KelasFinal objekFinal = new KelasFinal("Objek Final");
        objekFinal.tampilkanInfo();

        System.out.println("\n4. Testing Static Variable dan Method:");
        // Akses static method tanpa membuat objek
        ContohStatic.tampilkanJumlahObyek();

        // Membuat beberapa objek
        ContohStatic obj1 = new ContohStatic("Objek 1");
        ContohStatic obj2 = new ContohStatic("Objek 2");
        ContohStatic obj3 = new ContohStatic("Objek 3");

        obj1.tampilkanNama();
        obj2.tampilkanNama();
        ContohStatic.tampilkanJumlahObyek();
//
//        System.out.println("\n5. Testing Static Block:");
//        InisialisasiStatic.tampilkanKonfigurasi();

        System.out.println("\n6. Testing Static Final (Konstanta):");
        Konstanta.tampilkanInfoAplikasi();

        System.out.println("\n7. Testing Utility Class:");
        System.out.println("5 + 3 = " + MathUtils.tambah(5, 3));
        System.out.println("Luas lingkaran dengan radius 5: " +
                String.format("%.2f", MathUtils.hitungLuasLingkaran(5)));
        System.out.println("Apakah 17 prima? " + MathUtils.isPrima(17));
        System.out.println("Nilai E: " + MathUtils.E);

        // Contoh error handling
        try {
            // MathUtils obj = new MathUtils(); // Akan throw exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
