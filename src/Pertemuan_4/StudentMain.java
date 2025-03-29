package Pertemuan_4;

public class StudentMain {
    public static void main(String[] args) {
        Student x = new Student();
        Student y = x;
        Student z = new Student();

        x.setNrp("01");
        y.setNrp("02"); // x juga berubah karna y mereferensikan x

        System.out.println(x.getNrp());
        z.setNrp("03");

        x = z; // x sekarang mereferensikan objek z
        System.out.println(x.getNrp()); // 03
        System.out.println(y.getNrp()); // 02 (masih mereferensi objek awal)
    }
}
