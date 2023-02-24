package simulateur;

import simulateur.piece.Coque;
import simulateur.piece.Moteur;

public class BateauMilitaire extends Bateau {

    private int forceCanon;

    public BateauMilitaire(String nom, Coque coque, Moteur moteur) {
        super(nom, coque, moteur);
        // TODO Auto-generated constructor stub
    }
    
    public int getForceCanon() {
        return forceCanon;
    }

    public void setForceCanon(int forceCanon) {
        this.forceCanon = forceCanon;
    }

    public void attaque(Bateau cible) {
        System.out.println("J'attaque " + cible);
    }

    public boolean prendLaMer() {
        boolean appelClasseMere = super.prendLaMer();
        // important d'expliciter avec super que l'on execute
        // la méthode de la classe mère et pas celle là
        // sinon la méthode appelle la méthode qui appelle la méthode...
        // boucle infinie = erreur
        return true;
    }

    @Override
    public void arriveAuPort() {
        // TODO Auto-generated method stub

        System.out.println(
                "Je suis le " + nom + ", bateau militaire de première classe. "
                        + "J'arrive au port. J'ai parcouru au total :" + milesParcourus + " miles");
        super.arriveAuPort();
    }

    @Override
    public void navigue(double miles) {
        // TODO Auto-generated method stub

        System.out.println("Je navigue et je suis un bateau militaire");
        super.navigue(miles);
    }

    
}
