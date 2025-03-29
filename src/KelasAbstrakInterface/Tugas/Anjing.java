package KelasAbstrakInterface.Tugas;

public class Anjing extends Hewan implements Bunyi{
    private boolean biasaDilatih;

    public Anjing(String nama, int umur, boolean biasaDilatih) {
        super(nama, umur);
        this.biasaDilatih = biasaDilatih;
    }

    public boolean isBiasaDilatih() {
        return biasaDilatih;
    }

    // Implementasi method abstrak dari kelas Hewan
    @Override
    public String jenisHewan() {
        return "Anjing";
    }

    // Implementasi method dari interface Berbunyi
    @Override
    public String bersuara() {
        return "Woof!";
    }

    // Override method info dari kelas Hewan
    @Override
    public String info() {
        return super.info() + ", Bisa dilatih: " + (biasaDilatih ? "Ya" : "Tidak");
    }
}
