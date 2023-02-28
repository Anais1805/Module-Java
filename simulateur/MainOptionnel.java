package simulateur;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MainOptionnel {
    public static void main(String[] args){
        Scanner scannerClavier = new Scanner(System.in);
        System.out.println("Veuillez entrer un nouvelEtat");
        String nouvelEtat = scannerClavier.next();
        scannerClavier.nextLine();
        //transformation du String nouvel etat 
        // en variable de type Etat Bateau et en valeur de l'enum
        //ssi sa valeur  est équivalente à une des valeurs de l'enum
        EtatBateau monNouvelEtat = EtatBateau.valueOf(nouvelEtat);
        System.out.println("Mon nouvel Etat est :  " + monNouvelEtat);
    }
}
