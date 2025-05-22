package Pertemuan14;

public class Anak extends Induk{
    // tidak boleh melakukan override terhadap method tampilkanPesan()
    // public void tampilkanPesan() { } // Error! Tidak bisa override final method

    @Override
    public void methodBiasa() {
        System.out.println("Method biasa di-override oleh kelas Anak");
    }

    /* KEGUNAAN FINAL METHOD:
     * - Menjaga algoritma kritis tidak berubah
     * - Memastikan kontrak method tetap konsisten
     * - Security: mencegah subclass mengubah perilaku penting
     */
}
