package exo_10list;

import java.util.ArrayList;
import java.util.List;

public class exoList {
    public static void main(String args[]) {
        // Déclaration d'une liste de Integer
        List<Integer> maListe = new ArrayList<Integer>();
        // Ajout d'éléments
        maListe.add(2);
        maListe.add(34);
        maListe.add(67);
        maListe.add(89);
        maListe.add(102);

        // Afficher la taille de la liste
       System.out.println("Taille : " + maListe.size());
       
        // Ajout d'élément à un index donné
        maListe.add(1, 12);
        // Affichage de la liste (parcours de chaque élément)
        for (Integer inte : maListe) {
            System.out.println(inte);
        }
        // Suppression d'un élément à un certain index
        maListe.remove(0);
        // Affichage de la liste (parcours de chaque élément)
        for (Integer inte : maListe) {
            System.out.println("Deuxième boucle : " + inte);
        }
        
        

        

        

        

    }
}
