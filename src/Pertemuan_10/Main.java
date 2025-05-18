package Pertemuan_10;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.suara();
        kucing.makan();
        System.out.println("--------------");
        Bird bird = new Bird();
        bird.fly();
        bird.makan();
        bird.suara();
        bird.energy();
        bird.ketinggian();
        bird.durasi();
        System.out.println("--------------");
        Pesawat pesawat = new Pesawat();
        pesawat.fly();
        pesawat.energy();
        pesawat.ketinggian();
        pesawat.durasi();
    }
}
