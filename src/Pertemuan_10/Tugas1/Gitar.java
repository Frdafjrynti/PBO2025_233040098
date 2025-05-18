package Pertemuan_10.Tugas1;

public class Gitar extends AlatMusik implements JenisAlatMusik {
    public Gitar(String nama) {
        super(nama);
    }

    @Override
    public String suara() {
        return "jreng jreng";
    }

    @Override
    public void mainkan() {
        System.out.println("Dipetik " + nama);
    }
}

