package simulateur;

import java.util.Arrays;
import simulateur.piece.Coque;
import simulateur.piece.Moteur;



public class SimulationBateau {
    Bateau bateau;

    public static void main(String[] args) {
        
        Coque maCoque = new Coque(16);
        Moteur monMoteur = new Moteur(10, 12);
        Bateau monBateau = new Bateau("Le Queen Mary", maCoque, monMoteur);
        monBateau.getNom();
        monBateau.navigue(300);
        monBateau.navigue(500);
        monBateau.arriveAuPort();

        // System.out.println(monBateau.getCoque());
        // Coque maCoque  = new Coque(17);
        // //je construis ma coque
        //  monBateau.setCoque(maCoque);
         //Je la lie à mon bateau en mettant à jour l'attribut coque
         //cet attribut est un objet, c'est pour cela qu'il faut le créer en premier
         // de la classe Bateau avec cette coque en particulier.
         System.out.println("Ma coque a : " + monBateau.getCoque().getPointsDeVie() + " points de vie");
         System.out.println("Ma puissance est de : " + monBateau.getMoteur().getPuissance());
         System.out.println("Ma consommation est de : " + monBateau.getMoteur().getConsommation());
    
      
 

    //      Bateau[] mesBateaux = new Bateau[5];
    //     mesBateaux[0] = new Bateau("Le France", 90, 150, 30);
    //     mesBateaux[1] = new Bateau("Queen Mary", 50, 200, 50);
    //     mesBateaux[2] = new Bateau("Charles De Gaulles", 150, 300, 40);
    //     mesBateaux[3] = new Bateau("Maréchal Leclerc", 80, 400, 30);
    //     mesBateaux[4] = new Bateau("Brittania", 100, 500, 90);

    //     for (Bateau bateau : mesBateaux) {
    //         bateau.navigue(50);
    //         bateau.arriveAuPort();
    //     }
    //     Bateau[] mesAutresBateaux = new Bateau[5];
    //     int compteur = 0;
    //     while (compteur < 5) {
    //         Bateau bateau = new Bateau("LeFrance " + compteur, 90, 200, 50);
    //         mesAutresBateaux[compteur] = bateau;
    //         mesAutresBateaux[compteur].navigue(300);
    //         mesAutresBateaux[compteur].navigue(500);
    //         mesAutresBateaux[compteur].arriveAuPort();

    //         compteur++;
    //     }
    //     System.out.println(Arrays.toString(mesAutresBateaux));

    //     Avion monAvion = new Avion();
     }
}
