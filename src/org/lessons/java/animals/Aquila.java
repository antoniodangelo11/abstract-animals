package org.lessons.java.animals;

// Classe derivata
public class Aquila extends Animale{

    @Override
    public void verso() {
        System.out.println("Screech!");
    }
    @Override
    public void mangia() {
        System.out.println("Piccoli mammiferi e pesci");
    }

    // Metodi normali
    public void dormi() {
        super.dormi();
    }
}
