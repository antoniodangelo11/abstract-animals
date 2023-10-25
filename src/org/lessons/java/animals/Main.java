package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {

        // Stampo la classe Cane
        Cane cane = new Cane();
        System.out.println("Cane:");
        cane.dormi();
        cane.verso();
        cane.mangia();
        System.out.println();

        // Stampo la classe Passerotto
        Passerotto passerotto = new Passerotto();
        System.out.println("Passerotto:");
        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();
        System.out.println();

        // Stampo la classe Aquila
        Aquila aquila = new Aquila();
        System.out.println("Aquila:");
        aquila.dormi();
        aquila.verso();
        aquila.mangia();
        System.out.println();

        // Stampo la classe Delfino
        Delfino delfino = new Delfino();
        System.out.println("Delfino:");
        delfino.dormi();
        delfino.verso();
        delfino.mangia();
    }
}
