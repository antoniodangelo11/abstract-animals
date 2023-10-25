package org.lessons.java.animals;

// Classe derivata
public class Passerotto extends Animale implements IVolante{

    @Override
    public void verso() {
        System.out.println("Chirp!");
    }
    @Override
    public void mangia() {
        System.out.println("Semi e insetti");
    }
    @Override
    public void vola() {
        System.out.println("Volando!");
    }

    // Metodi normali
    public void dormi() {
        super.dormi();
    }
}
