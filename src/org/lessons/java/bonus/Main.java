package org.lessons.java.bonus;

public class Main {
    public static void main(String[] args) {

        Creator creator = new Creator();
        System.out.println("//Dispositivi//");
        System.out.println();

        Device lettoreDvd = creator.create("lettore dvd");
        lettoreDvd.play();
        lettoreDvd.stop();

        System.out.println();

        Device playstation = creator.create("playstation");
        playstation.play();
        playstation.stop();
    }
}
