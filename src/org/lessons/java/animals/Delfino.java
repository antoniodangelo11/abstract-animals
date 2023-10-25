package org.lessons.java.animals;

// Classe derivata
public class Delfino extends Animale {

    @Override
    public void verso() {
        System.out.println("Click!");
    }
    @Override
    public void mangia() {
        System.out.println("Pesce e calamari");
    }

    // Metodi normali
    public void dormi() {
        super.dormi();
    }
}
