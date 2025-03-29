package Pertemuan_3;

public class Main {
    public static void main(String[] args) {

//        instasisasi objek, yang objeknya sudah dikasih value
        Mahasiswa m1 = new Mahasiswa("233040098", 4.00, true);
        Mahasiswa m11 = m1;
        Mahasiswa m2 = new Mahasiswa("40098", 4.00, false);
        Mahasiswa m3 = m2;

        m2.nim = "9000";
        System.out.println(m1.nim);
//        m1.nim = "233040098";
//        m1.ipk = 4.00;

        System.out.println(m1.nim);
        System.out.println(m1.ipk);
        System.out.println(m1.statusPerwalian); // sebelum perwalian maka hasilnya false

//        m1.Perwalian(); //dipanggil
//        System.out.println(m1.statusPerwalian);
    }
}
