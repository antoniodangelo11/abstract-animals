package org.lessons.java.animals;

// Classe astratta
public abstract class Animale {

    // Metodi astratti
    public abstract void verso();
    public abstract void mangia();

    // Metodi normali
    public void dormi(){
        System.out.println("Zzz");
    }
}

