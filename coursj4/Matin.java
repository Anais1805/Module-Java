package coursj4;

import java.util.Scanner;
public class Matin {
    // type primitif et wrapper
    int a = scannerClavier.nextInt();
        scannerClavier.nextLine();
    public static void main(String[] args) {
        for (int i = 5; i < 10; i++) {
            System.out.println(i);
        }

        // boucle while
        int j = 15;
        while (j < 20) {
            System.out.println(j);
            j++;
        }

        // boucle do while
        int k = 0;
        do {
            System.out.println("Mon compteur est de : " + k);
            System.out.println("coucou");
            k++;
        } while (k < 5);

        // condition

        short forceElephant = 10;
        short forceRhino = 12;
        if (forceElephant > forceRhino) {
            System.out.println("Bravo l'éléphant !");
        } else {
            System.out.println("Bravo le rhino !");
        }

        switch (forceElephant) {
            case 1:
                System.out.println("La force vaut 1");
                break;
            case 5:
                System.out.println("La force vaut 5");
                break;
            case 10:
                System.out.println("La force vaut 10");
                break;
            default:
                System.out.println("La force a une valeur inconnue");
                break;
        }
        int resultat = 0;
        switch (forceElephant) {
            case 1, 5, 7 -> {
                System.out.println("L'éléphant est plutôt fort");
                resultat = 5;
            }
            case 10 -> {
                System.out.println("L'éléphant est fort");
                resultat = 10;
            }
            default -> {
                System.out.println("Je ne connais pass la force de l'éléphant");
            }
        }

        int forceEnNewton = switch (forceElephant) {
            case 10 -> {
                yield 200;
            }
            default -> {
                yield 100;
            }
        };
        System.out.println(forceEnNewton);
        // cette strucutre doit se terminer par un ;
        // car il y a une affectation = une instruction à l'intéreieur

        // Ternaire
        String force = forceElephant > forceRhino ? "ok" : "not ok";
        System.out.println(force);
        System.out.println(forceElephant > forceRhino ? forceElephant == forceRhino ? "ok" : "not ok" : "dacc");
        
        // permet d'examiner 3 conditions mais dégueu à ne pas faire car peu lisible
    }
}
