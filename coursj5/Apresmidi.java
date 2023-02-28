package coursj5;

import java.lang.management.MonitorInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Apresmidi {
    public static void main(String[] args) {
        // Définition d'une variable de type List<Integer>
        List<Integer> maListInt;
        // Affectation d'une nouvelle instance d'ArrayList
        maListInt = new ArrayList<>();
        // utilisation de la méthode add
        maListInt.add(Integer.valueOf(5));
        // on peut aussi le faire en autoboxing
        maListInt.add(5);
        maListInt.add(12);
        maListInt.add(25);
        // On peut aussi définir une longueur initiale
        List<Integer> maListInt2 = new ArrayList<>(100);

        // Utilisation de remove
        maListInt.remove(1);

        // Boucler sur la liste
        for (int i = 0; i < maListInt.size(); i++) {
            System.out.println(maListInt.get(i));
        }
        // ici Integer car ma List est de Type Integer
        for (Integer monInt : maListInt) {
            System.out.println(monInt);
        }

        List<String> mesPhrases = new ArrayList<>();
        mesPhrases.add("Hello");
        mesPhrases.add("Coucou");
        mesPhrases.add("Hi");
        mesPhrases.remove("Coucou");
        mesPhrases.isEmpty();
        System.out.println(mesPhrases.isEmpty());

        // Les sets:
        Set<String> monSet = new HashSet<String>();
        monSet.add("Booo");
        monSet.add("Booo");
        monSet.add("J'ai peur");
        monSet.add("coucou");
        monSet.remove("coucou");
        // Les doublons sont interdits donc quand on
        // demandera le nombre d'éléments on aura 2 !
        // Add n'ajoute pas de doublons
        System.out.println(monSet.size());

        for (String chaine : monSet) {
            System.out.println(chaine);
        }
        monSet.addAll(mesPhrases);
        for (String elem : monSet) {
            System.out.println(elem);
        }
    //vide le set mais on peut toujours boucler dessus
    // il ne se passera rien puisqu'il n'y a plus rien dans 
    // le set mais si on définit le set ou la list avec null
    // là ca plante.
        mesPhrases.clear();
        // mesPhrases = null;
        for(String phrases: mesPhrases){
            System.out.println(phrases);
        }

         //Iterator 
         // premier élément génère l'iterator
         // deuxieme élément montre qu'on continue le temps que ite à un
         // élément qui le suit
    for(Iterator<String> ite = monSet.iterator(); ite.hasNext();){
        // .next() renvoie l'élément suivant.
        String element = ite.next();
        System.out.println("Iterateur : " + element);
        // la suppression est autorisé ici mais pas dans une boucle normale
        //car on touche à la boucle en cours. 
        ite.remove();
    }

    Set<String> mesLivres = new HashSet<>();
    mesLivres.add("Le prince");
    mesLivres.add("Les conquérants de l'inutile");
    mesLivres.add("Alpinistes");

    // for(String monLivre : mesLivres){
    //     mesLivres.remove(monLivre);
    // }

    Iterator<String> monIte = mesLivres.iterator();
    while(monIte.hasNext()){
        String monLivre =  monIte.next();
        monIte.remove();
    }
    //Map 
    Map<String, Integer> notes = new HashMap();
    notes.put("Marie-Claire", 5);
    notes.put("Jean", 12);
    notes.put("Marie", 17);
    notes.put("Jacqueline", 14);
    notes.size();
    notes.remove("Marie");
    notes.get("Jean");
    System.out.println("Notes de Jean : " + notes.get("Jean"));

    // collections :
    Collections.max(maListInt);
    System.out.println(Collections.max(maListInt));
    List<String> motsMots = new ArrayList<String>();
    motsMots.add("chocolat");
    motsMots.add("vanille");
    motsMots.add("caramel");
    motsMots.add("noix de pécan");

   Collections.sort(motsMots);
   System.out.println(motsMots);
   Collections.reverse(motsMots);
   System.out.println(motsMots);
 


    }
}
