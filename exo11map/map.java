package exo11map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map {
    public static void main(String args[]) {
        // Création d'une Map dictionnaire avec comme type de clé String et comme type
        // de valeur String
        Map<String, String> mesChaines = new HashMap<>();
        // Ajout des définitions (dont un doublon).
        // La clé est le nom , la valeur est la définition
        mesChaines.put("lion", "animal bipède roi de la jungle");
        mesChaines.put("dauphin", "poisson intelligent");
        mesChaines.put("abeilles", "butine et vit en communauté");
        mesChaines.put("lion", "animal bipède roi de la jungle");

        // Affichage de la taille de la map
        System.out.println("Taille :" + mesChaines.size());
        // Affichage d'une définition d'un mot
        System.out.println("Definition : " + mesChaines.get("lion"));
        // Affichage de chaque définition avec sa clé et sa valeur
        for (Map.Entry<String, String> entrees : mesChaines.entrySet()) {
            System.out.println("La définition de " + entrees.getKey() + " est " + entrees.getValue());
        }
        // Suppression d'un élément de la map
        mesChaines.remove("abeilles");
        for (Map.Entry<String, String> entrees : mesChaines.entrySet()) {
            System.out.println("La définition de " + entrees.getKey() + " est " + entrees.getValue());
        }

        // https://www.codeurjava.com/2015/06/comment-parcourir-une-hashmap-en-java.html
        System.out.println("Boucle while");
        Iterator iterator = mesChaines.entrySet().iterator();
        while (iterator.hasNext()) {
        Map.Entry<String, String> entrees = (Map.Entry) iterator.next();
        System.out.println("clé: " + entrees.getKey() + " | valeur: " + entrees.getValue());
        }

    }
}
