package Pertemuan_9;

public class Mahasiswa extends Orang{
    public String nrp;
    public Mahasiswa(String alamat, String nama){
        this.alamat = alamat;
        this.setNama(nama);
    }
    public String getAlamat(){
        return alamat;
    }
    public void kerja(){
        System.out.println("ngabisisn duit");
    }

}
