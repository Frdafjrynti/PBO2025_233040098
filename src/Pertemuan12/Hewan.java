package Pertemuan12;

abstract class Hewan {
    abstract void suara(); // metode abstrak

    public void makan() { // metode konkret
        System.out.println("Eating....");
    }
}
