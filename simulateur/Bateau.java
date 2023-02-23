package simulateur;

public class Bateau {
    private static int nombreDeBateauxConstruits;
    private final String nom;

    public Coque getCoque() {
        return coque;
    }
    public void setCoque(Coque coque) {
        this.coque = coque;
    }
    private double milesParcourus;
    private Coque coque;

    // Ici, ce constructeur permet de construire un bateau en renseignant directement son nom``
    //pas mal du tout quand on veut donner un nom à chaque bateau d'une boucle for-each
    // public Bateau(String nouveauNom){
    //     this.nom = nouveauNom;
    //     this.nombreDeBateauxConstruits = this.nombreDeBateauxConstruits+1;
    //     System.out.println("Nombre de bateaux construits : " + nombreDeBateauxConstruits);
    // }
        public Bateau(String nom, int ptDeVieMaxCoque) {
        this.nom = nom;
        this.coque = new Coque(ptDeVieMaxCoque);
        this.nombreDeBateauxConstruits = this.nombreDeBateauxConstruits+1;
        System.out.println("Nombre de bateaux construits : " + nombreDeBateauxConstruits);
    

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

