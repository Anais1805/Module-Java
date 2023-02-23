package simulateur;

import simulateur.piece.Coque;
import simulateur.piece.Moteur;

public class Bateau {
    public static void setNombreDeBateauxConstruits(int nombreDeBateauxConstruits) {
        Bateau.nombreDeBateauxConstruits = nombreDeBateauxConstruits;
    }
    public Moteur getMoteur() {
        return moteur;
    }
    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }
    public double getMilesParcourus() {
        return milesParcourus;
    }
    public void setMilesParcourus(double milesParcourus) {
        this.milesParcourus = milesParcourus;
    }
    private static int nombreDeBateauxConstruits;
    private final String nom;
    private double milesParcourus;
    private Coque coque;
    private Moteur moteur;

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

    public Bateau(String nom, int ptDeVieMaxCoque, int puissance, int consommation) {
        this.nom = nom;
        this.coque = new Coque(ptDeVieMaxCoque);
        this.moteur = new Moteur(puissance, consommation);
        this.nombreDeBateauxConstruits = this.nombreDeBateauxConstruits + 1;
        System.out.println("Nombre de bateaux construits : " + nombreDeBateauxConstruits);

    }
    public Coque getCoque() {
        return coque;
    }
    public void setCoque(Coque coque) {
        this.coque = coque;
    }

    

    public static int getNombreDeBateauxConstruits() {
        return nombreDeBateauxConstruits;
    }
    public String getNom(){
        return nom;
    }

    public boolean prendLaMer(){
        return true;
    }
    public void navigue(double miles){
        milesParcourus += miles;
        System.out.println("Je navigue");
    }
    public void arriveAuPort(){
        System.out.println("Je suis le " + nom +". "+"J'arrive au port. J'ai parcouru au total :" + milesParcourus +" miles");
        milesParcourus = 0;
    }
    @Override
    public String toString() {
       return nom + " : super bateau !";
    }

    
}

