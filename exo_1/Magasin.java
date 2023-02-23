package exo_1;
public class Magasin{
    private String nom;
    private String adresse;

   private Chaussure chaussureEnVitrine;
 //attribut chaussure =
    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public Chaussure getChaussureEnVitrine() {
        return chaussureEnVitrine;
    }
    public static void main(String[] args){
        Basket mesBaskets = new Basket();
        Botte mesBottes = new Botte();
        ChaussureDeVille mesChaussuresDeVille = new ChaussureDeVille();
        Escarpin mesEscarpins = new Escarpin();
        Tennis mesTennis = new Tennis();

        mesBaskets.marche();
        mesBottes.marche();
        mesChaussuresDeVille.marche();
        mesEscarpins.marche();
        mesTennis.marche();

//Deuxième possibilité : on fait un array Chaussure de longueur 2
// avec deux nouvelles instances dedans
        Chaussure[] chaussures = new Chaussure[2];
    // grâce au polymorphisme, on créé deux nouvelles chaussures 
        chaussures[0] = new Basket();
        chaussures[1] = new Tennis();
    // on boucle sur cet array afin d'appeler leurs méthodes définies dans chaque classe    
        for (Chaussure chaussure : chaussures){
            chaussure.marche();
        }
    }
}