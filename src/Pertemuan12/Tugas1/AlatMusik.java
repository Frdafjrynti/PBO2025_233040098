package Pertemuan12.Tugas1;

public abstract class AlatMusik {
    protected String nama;

    // parameter
    public AlatMusik(String nama){
        this.nama = nama;
    }

    //getter
    public String getNama(){
        return nama;
    }

    // method abstrak untuk jenis suara alat musik
    public abstract String suara();
}
