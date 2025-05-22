package Pertemuan14.Tugas3;

public class TestCounter {
    public static void main(String[] args) {
        System.out.println("=== Test Counter ===");
        System.out.println("Jumlah instance awal: " + Counter.getInstanceCount());

        // Membuat beberapa objek Counter
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("\nTotal instance yang dibuat: " + Counter.getInstanceCount());
        System.out.println("ID Counter 1: " + c1.getId());
        System.out.println("ID Counter 2: " + c2.getId());
        System.out.println("ID Counter 3: " + c3.getId());

        // Membuat lagi untuk membuktikan counter terus bertambah
        Counter c4 = new Counter();
        Counter c5 = new Counter();

        System.out.println("Total instance sekarang: " + Counter.getInstanceCount());
    }
}
