package simulateur;

import simulateur.piece.Coque;
import simulateur.piece.Moteur;

public class Bateau implements Comparable<Bateau> {
    // On peut spécifier les éléments que l'on compare
    // En écrivant Comparable<Type>, ici Comparable<Bateau>
    // Bateau nous fait une erreur on peut la résoudre en implémentant
    // les méthodes non-implémentées avec la petite ampoule, cf., la méthode
    // compareTo en bas du fichier.
    private static int nombreDeBateauxConstruits;
    protected final String nom;
    protected double milesParcourus;
    private Coque coque;
    private Moteur moteur;
    private EtatBateau etat = EtatBateau.OPERATIONNEL;

    // Ici, ce constructeur permet de construire un bateau en renseignant
    // directement son nom``
    // pas mal du tout quand on veut donner un nom à chaque bateau d'une boucle
    // for-each
    // public Bateau(String nouveauNom){
    // this.nom = nouveauNom;
    // this.nombreDeBateauxConstruits = this.nombreDeBateauxConstruits+1;
    // System.out.println("Nombre de bateaux construits : " +
    // nombreDeBateauxConstruits);
    // }

    // public Bateau(String nom, int ptDeVieMaxCoque, int puissance, int
    // consommation) {
    // this.nom = nom;
    // this.coque = new Coque(ptDeVieMaxCoque);
    // this.moteur = new Moteur(puissance, consommation);
    // this.nombreDeBateauxConstruits = this.nombreDeBateauxConstruits + 1;
    // System.out.println("Nombre de bateaux construits : " +
    // nombreDeBateauxConstruits);

    // }
    public Bateau(String nom, Coque coque, Moteur moteur) {
        this.nom = nom;
        this.coque = coque;
        this.moteur = moteur;
        this.nombreDeBateauxConstruits += 1;
        System.out.println("Nombre de bateaux construits : " + nombreDeBateauxConstruits);

    }

    public EtatBateau getEtat() {
        return etat;
    }

    public void setEtat(EtatBateau etat) {
        this.etat = etat;
    }

    public double getMilesParcourus() {
        return milesParcourus;
    }

    public void setMilesParcourus(double milesParcourus) {
        this.milesParcourus = milesParcourus;
    }

    public Coque getCoque() {
        return coque;
    }

    public void setCoque(Coque coque) {
        this.coque = coque;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    public static int getNombreDeBateauxConstruits() {
        return nombreDeBateauxConstruits;
    }

    public String getNom() {
        return nom;
    }

    public boolean prendLaMer() {
        return true;
    }

    public void navigue(double miles) {
        milesParcourus += miles;
        System.out.println("Je navigue");
    }

    public void arriveAuPort() {
        System.out.println(
                "Je suis le " + nom + ". " + "J'arrive au port. J'ai parcouru au total :" + milesParcourus + " miles");
        milesParcourus = 0;
    }

    @Override
    public String toString() {
        return nom + " : super bateau !";
    }

    // si this est plus petit que autreBateau compareTo doit renvoyer une valeur
    // négative
    // dans ce cas this est placé avant autre Bateau
    // si this est plus grand que autreBateau compare To doit renvoyer une valeur
    // positive
    // dans ce cas this est placé après autre Bateau
    // dans les autres cas, compareTo renvoie 0;

    public int compareTo(Bateau bateau) {
        // on compare les noms, les strings sont déjà des comparables
        // donc il suffit de renvoyer le résultat de cette comparaison
        int result = bateau.nom.compareTo(nom);
        return result;
    }

}
