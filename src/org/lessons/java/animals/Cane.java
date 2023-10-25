package org.lessons.java.animals;

// Classe derivata
public class Cane extends Animale {

    @Override
    public void verso() {
        System.out.println("Woof!");
    }
    @Override
    public void mangia() {
        System.out.println("Carne");
    }

    // Metodi normali
    public void dormi() {
        super.dormi();
    }
}
