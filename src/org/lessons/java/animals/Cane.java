package org.lessons.java.animals;

// Classe derivata
public class Cane extends Animale implements INuotante{

    @Override
    public void verso() {
        System.out.println("Woof!");
    }
    @Override
    public void mangia() {
        System.out.println("Carne");
    }
    @Override
    public void nuota() {
        System.out.println("Sto nuotando!");
    }

    // Metodi normali
    public void dormi() {
        super.dormi();
    }
}
