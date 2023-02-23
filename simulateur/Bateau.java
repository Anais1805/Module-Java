package simulateur;

public class Bateau {
    private static int nombreDeBateauxConstruits;
    private String nom = "Queen Mary";
    private double milesParcourus;

// Construction d'un constructeur
    public Bateau(){
        System.out.println("Bateau créé!");
    }

    public Bateau(String nouveauNom) {
      nom = nouveauNom;

    }
    // Ici, ce constructeur permet de construire un bateau en renseignant directement son nom``
    //pas mal du tout quand on veut donner un nom à chaque bateau d'une boucle for-each
    public static int getNombreDeBateauxConstruits() {
        return nombreDeBateauxConstruits;
    }
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
