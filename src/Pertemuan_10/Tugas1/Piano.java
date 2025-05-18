package Pertemuan_10.Tugas1;

public class Piano extends AlatMusik implements JenisAlatMusik{
    public Piano(String nama) {
        super(nama);
    }

    @Override
    public String suara() {
        return "ting ting";
    }

    @Override
    public void mainkan() {
        System.out.println("Ditekan " + nama);
    }
}
