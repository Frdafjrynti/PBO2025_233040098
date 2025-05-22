package Pertemuan14;

// ontoh Penggunaan Praktis - Utility Class
public class MathUtils {
    // Private constructor untuk mencegah instantiation
    // Utility class tidak perlu dibuat objectnya, semua method static
    private MathUtils() {
        throw new UnsupportedOperationException("Utility class tidak boleh diinstansiasi");
    }

    // Konstanta matematika
    public static final double E = 2.718281828459045;

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static double hitungLuasLingkaran(double radius) {
        return Konstanta.PI * radius * radius; // Menggunakan konstanta PI dari class Konstanta
    }

    // Method untuk mengecek bilangan prima
    public static boolean isPrima(int n) {
        if (n <= 1) return false; // jika n kurang dari = 1 maka false, angka 0,1 dan negatif bukan bilangan prima
        if (n <= 3) return true; // jika n kurang dari atau = 3 maka true --> karna lolos dari pengecekkan pertama, maka n 2 atau 3 bilangan prima
        if (n % 2 == 0 || n % 3 == 0) return false; // jika n habis dibagai 2 atau n habis dibagi 3 maka false

        for (int i = 5; i * i <= n; i += 6) { // i dimulai dari 5, selama i dakali i kurang dari atau = n i + 6
            // dimulai dari 5 karna 2 dan 3 sudah lolos pengecekkan di atas
            // i * i <= n, hanya perlu pengecekkan sampai akar kuadrat
            // i += 6, bagian optimasi pola 6k±1 (Semua bilangan prima > 3 pasti berbentuk 6k-1 atau 6k+1)
            // Contoh: 5=6×1-1, 7=6×1+1, 11=6×2-1, 13=6×2+1
            if (n % i == 0 || n % (i + 2) == 0) return false; // jika n habis dibagai i atau n habis di bagi i + 2 maka false
        }
        return true;
    }
}
