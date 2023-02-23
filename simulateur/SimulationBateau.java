package simulateur;

import java.util.Arrays;

public class SimulationBateau {
    Bateau mbateau;

    public static void main(String[] args) {
        Bateau monBateau = new Bateau();
        monBateau.getNom();
        monBateau.navigue(300);
        monBateau.navigue(500);
        monBateau.arriveAuPort();

 

        Bateau[] mesBateaux = new Bateau[5];
        mesBateaux[0] = new Bateau("Le France");
        mesBateaux[1] = new Bateau("Queen Mary");
        mesBateaux[2] = new Bateau("Charles De Gaulles");
        mesBateaux[3] = new Bateau("Maréchal Leclerc");
        mesBateaux[4] = new Bateau("Brittania");

        for (Bateau bateau : mesBateaux) {
            bateau.navigue(50);
            bateau.arriveAuPort();
        }
        int compteur = 0;
        while (compteur < 5) {
            Bateau bateau = new Bateau();
            mesBateaux[compteur] = bateau;
            mesBateaux[compteur].setNom("Le France" + compteur);
            mesBateaux[compteur].navigue(300);
            mesBateaux[compteur].navigue(500);
            mesBateaux[compteur].arriveAuPort();

            compteur++;
        }
        System.out.println(Arrays.toString(mesBateaux));

        Avion monAvion = new Avion();
    }
}
