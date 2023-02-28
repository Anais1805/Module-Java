package coursj6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import simulateur.Bateau;
import simulateur.BateauCouleException;
import simulateur.BateauMilesParcourusComparator;
import simulateur.BateauMilitaire;
import simulateur.BateauMilitaireCanonForceComparator;
import simulateur.piece.Coque;

public class Matin {
    public static void main(String[] args) {
        // Trier une collection
        List<Bateau> registre = new ArrayList<>();
        Bateau potato = new Bateau("Le Potato", null, null);
        potato.setMilesParcourus(500);
        registre.add(potato);
        Bateau tomato = new Bateau("Le Tomato", null, null);
        tomato.setMilesParcourus(1000);
        registre.add(tomato);
        Bateau wrappo = new Bateau("Le Wrappo", null, null);
        wrappo.setMilesParcourus(800);
        registre.add(wrappo);
        // Sort ne marche pas car sort prend une liste d'éléments comparables.
        // Pour rendre les bateaux comparables, il suffit d'implémenter
        // l'interface Comparable dans la classe Bateau.
        // Tri avec l'ordre naturel
        Collections.sort(registre);
        for (Bateau bateaux : registre) {
            System.out.println(bateaux.getNom());
        }

        // Tri avec un autre ordre
        // mis dans la classe BateauMilesParcourusComparator
        // Cette classe implémente le comparateur, il faut donc
        // isntancier la classe, pas la méthode dans la classe comme
        // deuxieme paramètre de la méthode sort(), on lui donne la classe
        // où se trouve la méthode du comparateur et ensutie c'est sort qui l'utilise
        // comme il veut et le nombre de fois qu'il veut
        Collections.sort(registre, new BateauMilesParcourusComparator());
        for (Bateau bateauteau : registre) {
            System.out.println(bateauteau.getMilesParcourus1());
        }

        // Lambda : nous permet de faire la même chose en une ligne
        Collections.sort(registre, (Bateau b1, Bateau b2) -> {
            return -1;
        });
        // Les streams peuvent prendre en paramètres des lambda
        registre.stream().forEach(s -> System.out.println("coucou Stream : " + s));
        // forEach est une méthode qui prend un consumer = un
        // élément mais n'en fait rien après
        registre.stream().forEach(System.out::println);
        // sysout raccourci mais incompréhensible
        List<String> superListe = new ArrayList<>();
        superListe.add("coucou");
        superListe.add("hi");
        superListe.add("hello");
        superListe.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
        //ici je filtre et renvoie tous les éléments qui ont une taille
        // de plus de 4. 

        Set<Bateau> registreTrie = new TreeSet<>();
        registreTrie.add(potato);
        registreTrie.add(wrappo);
        registreTrie.add(tomato);
        for (Bateau bateau : registreTrie) {
            System.out.println("Set trié : " + bateau.getNom());
        }

        BateauMilitaire fraisier = new BateauMilitaire("Fraisier", null, null);
        BateauMilitaire parisBrest = new BateauMilitaire("Paris-Brest", null, null);
        BateauMilitaire eclair = new BateauMilitaire("Eclair", null, null);
        List<BateauMilitaire> nouveauRegistre = new ArrayList<BateauMilitaire>();
        nouveauRegistre.add(fraisier);
        nouveauRegistre.add(eclair);
        nouveauRegistre.add(parisBrest);
        nouveauRegistre.add(fraisier);

        fraisier.setForceCanon(500);
        parisBrest.setForceCanon(400);
        eclair.setForceCanon(200);
        Collections.sort(nouveauRegistre, new BateauMilitaireCanonForceComparator());
        for (BateauMilitaire bateaux : nouveauRegistre) {
            System.out.println(bateaux.getForceCanon());
        }

        System.out.println(Collections.frequency(nouveauRegistre, fraisier));
    }

}
