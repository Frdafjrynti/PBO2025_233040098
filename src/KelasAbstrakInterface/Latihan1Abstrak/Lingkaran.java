package KelasAbstrakInterface.Latihan1Abstrak;

public class Lingkaran extends Bentuk {
    public Lingkaran(int jari2){
        super(jari2);
    }
    /*
    L: PHI*r*r
     */

    @Override
    public double luas(){ // method luas untuk lingkaran
        return PHI*jari2*jari2;
    }
}
