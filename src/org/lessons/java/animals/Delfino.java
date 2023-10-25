package org.lessons.java.animals;

// Classe derivata
public class Delfino extends Animale implements INuotante{

    @Override
    public void verso() {
        System.out.println("Click!");
    }
    @Override
    public void mangia() {
        System.out.println("Pesce e calamari");
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
