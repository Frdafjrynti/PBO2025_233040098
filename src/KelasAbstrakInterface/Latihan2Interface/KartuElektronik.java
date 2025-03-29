package KelasAbstrakInterface.Latihan2Interface;

public class KartuElektronik implements Kartu{
    // method abstrak yang harus diimplementasikan
    private String kodeBank;
    private String pin;

    // kelas KartuElektronik yang mengimplementasikan interface kartu
    public KartuElektronik(String kodeBank, String pin) {
        super();
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    @Override
    public boolean otentikasi(String pinInput){
        if (pin.equals(pinInput)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String encode(String pin){
        // melakukan enkripsi inputan pin
        return null;
    }
}
