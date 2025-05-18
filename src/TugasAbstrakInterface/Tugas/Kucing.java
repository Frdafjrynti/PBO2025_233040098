package TugasAbstrakInterface.Tugas;

public class Kucing extends Hewan implements Bunyi {
    private String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }

    // Implementasi method abstrak dari kelas Hewan
    @Override
    public String jenisHewan() {
        return "Kucing";
    }

    // Implementasi method dari interface Berbunyi
    @Override
    public String bersuara() {
        return "Meow!";
    }

    // Override method info dari kelas Hewan
    @Override
    public String info() {
        return super.info() + ", Ras: " + ras;
    }
}
