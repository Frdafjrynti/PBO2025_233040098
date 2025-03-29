package KelasAbstrakInterface.Latihan1Abstrak;

class Pertanyaan {
    /*
    1. sebutkan method abstrak yang terdapat di kelas asbtrak bentuk!
    ===> method abstrak pada kelas bentuk adalah public abstract double luas();
    2. jelaskan apa perbedaannya method luas di kelsa bentuk dan dikelas lingkaran
    dan  kelas tabung!
    ===> dikelas bentuk, methid luas() di deklarasikan sebagai abstrak tanpa implementasi.
    ===> dikelas lingkaran, method luas() diimplementasikan untuk mneghitung luas lingkaran
    ===> dikelas tabung, method luas() diimplementasikan untuk menghitung luas permukaan tabung
    3. jelaskann bagaimana jika method luas dikelas tabung dihilangkan atau tidak mengimpelemtasikannya!
    ===> jika method luas() di kelas tabung dihilangkan, maka kelas tabung akan mewarisi implementasu method luas()
    dari kelas lingkaran yang akan menyebabkan perhitungan luas menjadi tidak tepat untuk objek tabung, karna akan menghitung
    luas lingkaran bukan luas permukaan tabung
    5. buatlah diagram kelas dari contoh program kels abstrak!
    ┌───────────┐
    │  Bentuk   │
    │(abstract) │
    ├───────────┤
    │-nama      │
    ├───────────┤
    │+getNama() │
    │+luas()    │
    └─────┬─────┘
          │
          │
    ┌─────▼─────┐
    │ Lingkaran │
    ├───────────┤
    │-jariJari  │
    ├───────────┤
    │+getJariJari()│
    │+luas()    │
    └─────┬─────┘
          │
          │
    ┌─────▼─────┐
    │  Tabung   │
    ├───────────┤
    │-tinggi    │
    ├───────────┤
    │+getTinggi()│
    │+luas()    │
    │+volume()  │
    └───────────┘
     */
}
