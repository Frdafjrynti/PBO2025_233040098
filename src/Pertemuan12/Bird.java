package Pertemuan12;

public class Bird extends Hewan implements Flyable{

    public void fly(){
        System.out.println("Burung terbang menggunakan sayap");
    }
    public void suara() {
        System.out.println("wiw");
    }
    public void energy() {
        System.out.println("Makan");
    }
    public void ketinggian() {
        System.out.println("100 meter");
    }
    public void durasi() {
        System.out.println("sejam");
    }
}
