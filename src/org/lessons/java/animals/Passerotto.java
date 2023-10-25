package org.lessons.java.animals;

// Classe derivata
public class Passerotto extends Animale {

    @Override
    public void verso() {
        System.out.println("Chirp!");
    }
    @Override
    public void mangia() {
        System.out.println("Semi e insetti");
    }

    // Metodi normali
    public void dormi() {
        super.dormi();
    }
}
