package simulateur;

import java.util.Arrays;



public class SimulationBateau {
    Bateau bateau;

    public static void main(String[] args) {
        Bateau monBateau = new Bateau("Le Queen Mary", 77);
        monBateau.getNom();
        monBateau.navigue(300);
        monBateau.navigue(500);
        monBateau.arriveAuPort();
        // System.out.println(monBateau.getCoque());
        // Coque maCoque  = new Coque(17);
        // //je construis ma coque
        //  monBateau.setCoque(maCoque);
         //Je la lie à mon bateau en mettant à jour l'attribut coque
         // de la classe Bateau avec cette coque en particulier.
         System.out.println(monBateau.getCoque().getPointsDeVie());
   
        
      
 

         Bateau[] mesBateaux = new Bateau[5];
        mesBateaux[0] = new Bateau("Le France", 90);
        mesBateaux[1] = new Bateau("Queen Mary", 50);
        mesBateaux[2] = new Bateau("Charles De Gaulles", 150);
        mesBateaux[3] = new Bateau("Maréchal Leclerc", 80);
        mesBateaux[4] = new Bateau("Brittania", 100);

        for (Bateau bateau : mesBateaux) {
            bateau.navigue(50);
            bateau.arriveAuPort();
        }
        Bateau[] mesAutresBateaux = new Bateau[5];
        int compteur = 0;
        while (compteur < 5) {
            Bateau bateau = new Bateau("LeFrance " + compteur, 90);
            mesAutresBateaux[compteur] = bateau;
            mesAutresBateaux[compteur].navigue(300);
            mesAutresBateaux[compteur].navigue(500);
            mesAutresBateaux[compteur].arriveAuPort();

            compteur++;
        }
        System.out.println(Arrays.toString(mesAutresBateaux));

        Avion monAvion = new Avion();
    }
}
