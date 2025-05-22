package Pertemuan14;

// final pada method
class Induk {
    // Final method tidak bisa di-override oleh subclass
    // Gunakan ketika ingin memastikan implementasi method tidak berubah di child class
    public final void tampilkanPesan() {
        System.out.println("Pesan dari kelas Induk");
    }

    // Method biasa yang bisa di-override
    public void methodBiasa() {
        System.out.println("Method biasa dari kelas Induk");
    }
}
