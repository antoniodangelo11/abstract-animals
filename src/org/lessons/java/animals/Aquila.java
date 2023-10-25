package org.lessons.java.animals;

// Classe derivata
public class Aquila extends Animale implements IVolante{

    @Override
    public void verso() {
        System.out.println("Screech!");
    }
    @Override
    public void mangia() {
        System.out.println("Piccoli mammiferi e pesci");
    }
    @Override
    public void vola() {
        System.out.println("Sto volando!");
    }

    // Metodi normali
    public void dormi() {
        super.dormi();
    }
}
