package KelasAbstrakInterface.Latihan1Abstrak;

public abstract class Bentuk {
    protected double PHI = 3.14;
    protected int jari2;

    public Bentuk(int jari2) {
        super();
        this.jari2 = jari2;
    }

    //method abstrak kelas bentuk yang harus diimplementasikan oleh kelas turunan
    public abstract double luas();

    // setter & getter
    public int getJari2(){
        return jari2;
    }
    public void setJari2(int jari2){
        this.jari2 = jari2;
    }
    public double getPHI(){
        return PHI;
    }
    public void setPHI(double PHI){
        this.PHI = PHI;
    }
}
