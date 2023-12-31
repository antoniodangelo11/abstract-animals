package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {

        // Creo un array di Animale
        Animale[] animali = {new Cane(), new Passerotto(), new Delfino(), new Aquila()};
        System.out.println("//Animali//");
        System.out.println();

        for (Animale animale : animali) {

            System.out.println(animale.getClass().getSimpleName() + ":");
            animale.dormi();
            animale.verso();
            animale.mangia();
            System.out.println();

            // Verifico se l'animale vola o nuota
            if (animale instanceof IVolante) {
                System.out.print("volo o nuoto, ma io sto: ");
                faiVolare((IVolante) animale);
                System.out.println();
            }

            if (animale instanceof INuotante) {
                System.out.print("volo o nuoto, ma io sto: ");
                faiNuotare((INuotante) animale);
                System.out.println();
            }
        }
    }


    // Metodi statici
    public static void faiVolare(IVolante animale){
        animale.vola();
    }

    public static void faiNuotare(INuotante animale){
        animale.nuota();
    }

}
