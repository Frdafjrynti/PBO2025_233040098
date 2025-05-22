package Pertemuan14.Tugas3;

// penghitungan inisialisasi dengan varibel static
public class Counter {
    // Variabel static - shared oleh semua instance
    private static int instanceCount = 0;
    private int id;

    // Constructor yang menambah instanceCount setiap kali objek dibuat
    public Counter() {
        instanceCount++; // Increment setiap kali constructor dipanggil
        this.id = instanceCount;
        System.out.println("Counter #" + id + " dibuat");
    }

    // Method static untuk mengakses variabel static
    public static int getInstanceCount() {
        return instanceCount;
    }

    public int getId() {
        return id;
    }
}
