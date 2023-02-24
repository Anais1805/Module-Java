package simulateur;

import simulateur.piece.Coque;
import simulateur.piece.Moteur;

public class BateauMilitaire extends Bateau {

    int forceCanon;

    public BateauMilitaire(String nom, Coque coque, Moteur moteur) {
        super(nom, coque, moteur);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean prendLaMer() {
        boolean appelClasseMere = super.prendLaMer();
        // important d'expliciter avec super que l'on execute
        // la méthode de la classe mère et pas celle là
        // sinon la méthode appelle la méthode qui appelle la méthode...
        // boucle infinie = erreur
        return true;
    }

    @Override
    public void navigue(double miles) {
        milesParcourus += miles;
        System.out.println("Je navigue et je suis un bateau militaire");
    }

    @Override
    public void arriveAuPort() {
        System.out.println(
                "Je suis le " + nom + ", bateau militaire de première classe. "
                        + "J'arrive au port. J'ai parcouru au total :" + milesParcourus + " miles");
        milesParcourus = 0;
    }

    public int getForceCanon() {
        return forceCanon;
    }

    public void setForceCanon(int forceCanon) {
        this.forceCanon = forceCanon;
    }
    public void attaque(Bateau cible){
        System.out.println("J'attaque " + cible);
    }
}
