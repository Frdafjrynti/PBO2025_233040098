package Pertemuan13;

public class MetodePembayaran {
    protected String namaPenyedia;
    protected String nomorAkun;
    protected double saldoTersedia;
    protected boolean statusAktif;

    public MetodePembayaran(String namaPenyedia, String nomorAkun, double saldoTersedia) {
        this.namaPenyedia = namaPenyedia;
        this.nomorAkun = nomorAkun;
        this.saldoTersedia = saldoTersedia;
        this.statusAktif = true;
    }

    // Method konkret
    public void tampilkanInfo() {
        System.out.println("Provider: " + namaPenyedia);
        System.out.println("Nomor Akun: " + nomorAkun);
        System.out.println("Saldo: Rp " + String.format("%,.0f", saldoTersedia));
        System.out.println("Status: " + (statusAktif ? "Aktif" : "Nonaktif"));
    }

    public boolean cekSaldo(double jumlah) {
        return saldoTersedia >= jumlah;
    }

    protected void kurangiSaldo(double jumlah) {
        saldoTersedia -= jumlah;
    }

    protected void tambahSaldo(double jumlah) {
        saldoTersedia += jumlah;
    }

}
