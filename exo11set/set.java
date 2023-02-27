package exo11set;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String args[]) {
        // Création d'un Set de Short

        Set<Short> mesShorts = new HashSet<Short>();
        // Ajout d'éléments, dont des doublons
        mesShorts.add((short) 2);
        mesShorts.add((short)5);
        mesShorts.add((short)7);
        mesShorts.add((short)2);
        // Affichage de chaque élément du set
        for (Short monShort : mesShorts){
            System.out.println(monShort);
        }

        // Affichage de la taille du set
        System.out.println("Taille : " + mesShorts.size());
        // Vérification que le Set contient bien un élément précédemment inséré
        System.out.println(mesShorts.contains((short) 2));

        // Suppression de cet élément
        mesShorts.remove((short) 2);

        // Vérification que le Set ne contient plus cet élément
        for (Short monShortSans2 : mesShorts) {
            System.out.println("Ma Liste moins 2 : "  + monShortSans2);
        }
    }
}
