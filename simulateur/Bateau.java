package simulateur;

public class Bateau {
    private String nom = "Queen Mary";
    private double milesParcourus;
    private static int nombreDeBateauxConstruits;

    public String getNom(){
        return nom;
    }
    public void setNom(String nouveauNom){
        this.nom = nouveauNom;
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
