package Pertemuan5;

public class MataKuliah {
    private String kode, nama, index, dosenPengampu;
    private int sks;
    private char nilai;

    // konstruktor lengkap
    public MataKuliah(String kode, String nama, String index, int sks, char nilai, String dosenPengampu) {
        super();
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
        this.nilai = nilai;
        this.dosenPengampu = dosenPengampu;
    }

    public double getNilaiIndex() {
        switch (index) {
            case "A": return 4;
            case "AB": return 3.5;
            case "B": return 3;
            case "BC": return 2.5;
            case "C": return 2;
            case "D": return 1;
            case "E": return 0;
            default: return 0;
        }
    }

    // konstruktor tanpa nilai, jika belum ada nilai atau belum ditentukan memberikan nilai default T untuk
    // menghindari error
    // komstruktor ini akan memanggil konstruktor lengkap dengan nilai = 'T'
    public MataKuliah(String kode, String nama, String index, int sks, String dosenPengampu) {
        this(kode, nama, index, sks, 'T', dosenPengampu); // saat digunakan data nilai belum terisi tetapi data dosen
                                                                // sudah lengkap, nilai akan diisi dengan setNilai()
    }

    // konstruktor tanpa dosenPengampu dan nilai
    // konstruktor ini akan memanggil konstruktor kedua dan otomatis memberikan default value
    public MataKuliah(String kode, String nama, String index, int sks) {
        this(kode, nama, index, sks, 'T',  "Tidak diketahui");
    }

    public String display() {
        StringBuilder sb = new StringBuilder();// StringBuilder digunakan untuk membangun string dalam memori secara efisien (memanfaatkan satu buffer di memori untuk menyusun string)
                                                // digunakan saat ingin mengembalikan nilai atau menggabungkan string secara dinamis tanpa mencetaknya langsung kelayar
                                                // penggabungan string dengan stringBuilder tidak menciptakan objek baru, sehingga lebih hemat memori dan lebih cepat
//        return kode + " " + nama + " " + index + " " + sks + " " + dosenPengampu;
        sb.append("Kode : ").append(kode).append("\n");
        sb.append("Mata Kuliah : ").append(nama).append("\n");
        sb.append("Index : ").append(index).append("\n");
        sb.append("Dosen Pengampu : ").append(dosenPengampu).append("\n");
        return sb.toString();
    }
    public int getSks() {
        return sks;
    }
    public void setSks(int sks) {
        this.sks = sks;
    }
    public String getNilai() {
        return nilai + " ";
    }
    public void setNilai(char nilai) {
        this.nilai = nilai;
    }
    public String getDosenPengampu() {
        return dosenPengampu;
    }
}
