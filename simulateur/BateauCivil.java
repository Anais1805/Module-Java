package simulateur;

import simulateur.piece.Coque;
import simulateur.piece.Moteur;

public class BateauCivil extends Bateau {

    private int nombreCivil;


    public BateauCivil(String nom, Coque coque, Moteur moteur) {
        super(nom, coque, moteur);
    }

    public int getNombreCivil() {
        return nombreCivil;
    }

    public void setNombreCivil(int nombreCivil) {
        this.nombreCivil = nombreCivil;
        System.out.println("Je transporte : " + nombreCivil + " passagers");
    }

    public boolean prendLaMer() {
        boolean appelClasseMere = super.prendLaMer();
        // important d'expliciter avec super que l'on execute
        // la méthode de la classe mère et pas celle là
        // sinon la méthode appelle la méthode qui appelle la méthode...
        // boucle infinie = erreur
        return true;
    }

    public void navigue(double miles) {
        System.out.println("Je navigue et je suis un bateau civil");
        super.navigue(miles);
    }

    public void arriveAuPort() {
        System.out.println(
                "Je suis le " + nom + ", bateau civil de première classe. "
                        + "J'arrive au port. J'ai parcouru au total :" + milesParcourus + " miles");
        super.arriveAuPort();
    }
}
