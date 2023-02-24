package exo_8conditions;

import java.util.Scanner;

public class ExoConditions {

    public static void main(String[] args) {
        // Récupération de deux variables a et b
        Scanner scannerClavier = new Scanner(System.in);
        System.out.println("Veuillez entrer un entier a");
        int a = scannerClavier.nextInt();
        scannerClavier.nextLine();
        System.out.println("Veuillez entrer un entier b");
        int b = scannerClavier.nextInt();
        scannerClavier.nextLine();
        System.out.println("Veuillez entrer un entier c");
        int c = scannerClavier.nextInt();
        scannerClavier.nextLine();
        System.out.println("Veuillez entrer un entier d");
        int d = scannerClavier.nextInt();
        scannerClavier.nextLine();

        //Bonus : 
        if (a > b && a > c && a>d) {
            System.out.println(a);
        } else if (b > c && b > a && b>d) {
            System.out.println(b);
        }else if (c > a  && c > b && c>d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
        // Chercher le maximum entre a et b (ne faîtes pas ça chez vous, il
        // y a beaucoup mieux en mode 'Programmation Orientée Objet')
        // et afficher le résultat
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        // Chercher le maximum entre a,b et c
        // et afficher le résultat8
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c && b > a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        // Afficher si a est pair ou impair avec un switch
        // boolean pair = a%2 == 0;
        // boolean impair = a%2 != 0;

        switch (a % 2) {
            case 0 -> {
                System.out.println("a est pair!");
            }
            case 1 -> {
                System.out.println("a est impair!");
            }
        }
        // Afficher si a est pair ou impair avec une expression ternaire
        System.out.println(a % 2 == 0 ? "a est pair" : "a est impair");
        // Fermeture des ressources (il y a mieux pour ce faire, mais nous verrons cela
        // plus tard)
        scannerClavier.close();
    }

}
