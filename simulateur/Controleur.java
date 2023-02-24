package simulateur;

public class Controleur {

    public void controle(Bateau bateau) {
        System.out.println("Je controle les bateaux");
        if (bateau instanceof Bateau) {
            bateau.prendLaMer();
            bateau.navigue(200);
            bateau.arriveAuPort();
        }

    }
}
