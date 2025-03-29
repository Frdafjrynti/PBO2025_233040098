package KelasAbstrakInterface.Latihan1Abstrak;

public class Tabung extends Bentuk {
    private int tinggi;

    public Tabung(){
        super(0);
    }
    public Tabung(int jari2, int tinggi){
        super(jari2);
        this.tinggi = tinggi;
    }
    /*
    L: 2n . r (r*t)
     */
    @Override
    public double luas() { //  method luas untuk tabung
        return 2 * PHI * jari2 * (jari2 + tinggi); // lusa permukaan tabung
    }

    // setter & getter
    public int getTinggi() {
        return tinggi;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
