package exo_13streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.ToIntFunction;

public class Streams {

    public static void main(String[] args) {

        // Création d'une liste d'Entreprises
        List<Entreprise> superList = new ArrayList<>();
        superList.add(new Entreprise(2000, "Nantes", true));
        superList.add(new Entreprise(4000, "Montpellier", true));
        superList.add(new Entreprise(5000, "Bordeaux", true));
        superList.add(new Entreprise(6000, "Lyon", false));
        superList.add(new Entreprise(7000, "Paris", true));
        superList.add(new Entreprise(1000, "Strasbourg", false));
        superList.add(new Entreprise(4000, "Metz", true));

        // Tous les exercices ci-dessous sont à faire avec Stream
        // Affichage des entreprises
        superList.stream().forEach(s -> System.out.println(s));

        // Tri des entreprises par chiffre d'affaires décroissant
        superList.stream().sorted((e1, e2) -> {
            return e2.getChiffreAffaires() - e1.getChiffreAffaires();
        }).forEach(e -> System.out
                .println("L'entreprise est : " + e + " et a comme chiffre d'affaires : " + e.getChiffreAffaires()));
        // On n'affiche que les trois entreprises ayant le plus grand chiffre d'affaires
        superList.stream().sorted((e1, e2) -> {
            return e2.getChiffreAffaires() - e1.getChiffreAffaires();
        }).limit(3).forEach(s -> System.out.println("Les 3 entreprises avec le plus grand chiffre d'affaires " + s));
        // On n'affiche que les trois entreprises ayant le plus grand chiffre
        // d'affaires,
        // mais en ne prenant en compte que les entreprises actives
        superList.stream().sorted((e1, e2) -> {
            return e2.getChiffreAffaires() - e1.getChiffreAffaires();
        }).filter(s -> s.isActif() == true).limit(3).forEach(s -> System.out.println("Les 3 entreprises parmi les actives :  " + s));

        // On n'affiche que l'entreprise ayant le plus petit chiffre d'affaires
        superList.stream().sorted((e1, e2) -> {
            return e1.getChiffreAffaires() - e2.getChiffreAffaires();
        }).filter(s -> s.isActif() == true).limit(1).forEach(s -> System.out.println("Le plus petit chiffre d'affaire est :  " + s.getChiffreAffaires()));
        // Affichage uniquement des chiffres d'affaires (en utilisant mapToInt)

        superList.stream().mapToInt(s -> s.getChiffreAffaires()).forEach(s -> System.out.println("Affichage des chiffres d'affaires : " + s));
        // Calcul du chiffre d'affaires moyen
        OptionalDouble avg = superList.stream().mapToInt(s -> s.getChiffreAffaires())
                .average();
                System.out.println("Moyenne du chiffre d'affaire : " + avg.getAsDouble());
        // Calcul du chiffres d'affaires moyen d'entreprises actives
        OptionalDouble avgActive = superList.stream().filter(s -> s.isActif() == true).mapToInt(s -> s.getChiffreAffaires())
                .average();
        System.out.println("Moyenne du chiffre d'affaire des entreprises actives : " + avgActive.getAsDouble());

    }
}

class Entreprise {

    private int chiffreAffaires;
    private String ville;
    private boolean actif;

    public Entreprise(int chiffreAffaires, String ville, boolean actif) {
        super();
        this.chiffreAffaires = chiffreAffaires;
        this.ville = ville;
        this.actif = actif;
    }

    public int getChiffreAffaires() {
        return chiffreAffaires;
    }

    public void setChiffreAffaires(int chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    @Override
    public String toString() {
        return "Entreprise [ville=" + ville + ", actif=" + actif + "]";
    }

}
