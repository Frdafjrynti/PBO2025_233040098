package Pertemuan13.Latihan;

public class PolymorphismDemo {
    public static void main(String[] args) {
            System.out.println("=== DEMONSTRASI POLIMORFISME ===\n");

            // 1. Membuat array dengan tipe parent class (Bentuk)
            Bentuk[] koleksiBentuk = {
                    new Lingkaran("Merah", 5.0),
                    new Lingkaran("Biru", 3.5),
                    new Tabung("Hijau", 4.0, 10.0),
                    new Tabung("Kuning", 2.5, 8.0)
            };

            // 2. Polimorfisme melalui array - method yang dipanggil tergantung tipe objek
            System.out.println("1. POLIMORFISME MELALUI ARRAY:");
            for (Bentuk bentuk : koleksiBentuk) {
                bentuk.tampilkanInfo(); // Memanggil method yang sesuai dengan tipe objek
            }

            // 3. Polimorfisme melalui parameter method
            System.out.println("\n2. POLIMORFISME MELALUI PARAMETER METHOD:");
            Lingkaran lingkaran1 = new Lingkaran("Orange", 6.0);
            Tabung tabung1 = new Tabung("Ungu", 3.0, 12.0);

            prosesGeometri(lingkaran1);
            prosesGeometri(tabung1);

            // 4. Polimorfisme dengan Interface
            System.out.println("\n3. POLIMORFISME DENGAN INTERFACE:");
            Geometri[] koleksiGeometri = {
                    new Lingkaran("Pink", 4.5),
                    new Tabung("Coklat", 5.0, 7.0)
            };

            for (Geometri geo : koleksiGeometri) {
                System.out.println("Luas: " + String.format("%.2f", geo.hitungLuas()));
                System.out.println("Keliling: " + String.format("%.2f", geo.hitungKeliling()));
                geo.tampilkanInfo();
            }

            // 5. Demonstrasi Method Overriding
            System.out.println("\n4. DEMONSTRASI METHOD OVERRIDING:");
            Bentuk bentukAsliLingkaran = new Lingkaran("Hitam", 7.0);
            Bentuk bentukAsliTabung = new Tabung("Putih", 4.5, 9.0);

            System.out.println("Method hitungLuas() dipanggil pada objek yang berbeda:");
            System.out.println("Luas lingkaran: " + String.format("%.2f", bentukAsliLingkaran.hitungLuas()));
            System.out.println("Luas tabung: " + String.format("%.2f", bentukAsliTabung.hitungLuas()));

            // 6. Runtime Type Checking dengan instanceof
            System.out.println("\n5. RUNTIME TYPE CHECKING:");
            cekTipeBentuk(lingkaran1);
            cekTipeBentuk(tabung1);

            // 7. Downcasting untuk mengakses method khusus
            System.out.println("\n6. DOWNCASTING UNTUK METHOD KHUSUS:");
            for (Bentuk bentuk : koleksiBentuk) {
                if (bentuk instanceof Tabung) {
                    Tabung tabung = (Tabung) bentuk; // Downcasting
                    System.out.println("Volume tabung " + tabung.warna + ": " +
                            String.format("%.2f", tabung.hitungVolume()));
                }
            }
        }

        // Method yang menerima parameter bertipe parent class (polimorfisme)
        public static void prosesGeometri (Bentuk bentuk){
            System.out.println("Memproses bentuk geometri:");
            bentuk.tampilkanInfo();
        }

        // Method untuk demonstrasi instanceof
        public static void cekTipeBentuk (Bentuk bentuk){
            if (bentuk instanceof Tabung) {
                System.out.println("Ini adalah objek Tabung");
                Tabung tabung = (Tabung) bentuk;
                System.out.println("Volume: " + String.format("%.2f", tabung.hitungVolume()));
            } else if (bentuk instanceof Lingkaran) {
                System.out.println("Ini adalah objek Lingkaran");
                System.out.println("Jari-jari: " + ((Lingkaran) bentuk).getJariJari());
            }
            System.out.println();
        }
}
