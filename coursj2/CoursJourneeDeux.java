package coursj2;

public class CoursJourneeDeux {
    //définition d'un attribut
    private Object monObjet;
    private static Object monObjetStatique;

    // Je suis un commentaire
    /*Je suis un commentaire
     * de plusieurs lignes
     */

     //définition d'une méthode
     //public : pour la visibilité, int: pour le type de données renvoyées
    public int maMethode(int monEntier1){
        return monEntier1 +3;
    }
    public static int getCompteur(){
        return 4;
    }
    public static void main(String[] args){
        System.out.println("Salut!");
        for(String arg : args){
            System.out.println(arg);
        }
        int monPremierInt;
        monPremierInt = 13;
        float monPremierFloat;
        monPremierFloat = 3.14f;
        boolean monPremierBoolean;
        monPremierBoolean = true;
        //affectation multiple : moche à éviter
        int a,b,c = b = a = 3;

        //Opérateur simple
        int somme = a+b;
        //opérateur unitaire postfixe : incrémentation
        somme++;
            //équivalent à :
            somme = somme +1;
        //opérateur unitaire préfixe : incrémentation
        ++somme;
            //incrémente + affectation
            System.out.println(somme);
            int maValeur = 5;
            maValeur= ++somme;
            System.out.println(maValeur);
         //affecte + incrémente
            maValeur = somme++;
         System.out.println(maValeur);
        // autre possibilté pour ajouter : 
            maValeur += 5;
        // Operateur de comapraison
        boolean jeSuisPLusGrand = true;
        int maTaille = 165;
        int tailleDePaul = 180;
        jeSuisPLusGrand = maTaille>tailleDePaul;
        System.out.println(jeSuisPLusGrand);
        //jeSuisPlusGrand est devenu false
        boolean paulEstPlusGrand = true;
        boolean jeSuisPlusGrandeQuePaul =  jeSuisPLusGrand && paulEstPlusGrand;
        System.out.println(jeSuisPlusGrandeQuePaul);
        boolean plusGrande =  jeSuisPLusGrand && calculeTaille();
        //  && est plus efficace que & car ce dernier impose d'aller lire
        // calculeTaille() alors que si jeSuisPLusGrand est faux, il n'y a 
        // pas besoin d'aller jusque là puisque avec l'opérateur & si mon premier
        // morceau est faux, le tout sera nécessairement faux.
        System.out.println(plusGrande);
        
        //opérateur de négation : 
        boolean jeVaisALaPlage = true;
        boolean jeNeVaisPasALaPlage = !jeVaisALaPlage;
        boolean monVoisinEstALaPlage = true;
        boolean ilFaitBeau = true;
        boolean jeVaisALaPlageSiMonVoisinNyEstPas = ilFaitBeau && !monVoisinEstALaPlage;

        //Opérateur ternaire : utilisation de boolean + affectation
        //Je mets dans carburant 15 si je vais à la plage.
        int carburantRequis = jeVaisALaPlage ? 15 : 0;
        System.out.println(carburantRequis);
        int carburant = (jeVaisALaPlageSiMonVoisinNyEstPas && monVoisinEstALaPlage) || ilFaitBeau ? 16:7;
        System.out.println(carburant);

    }
      private static boolean calculeTaille(){
            return false;
        }
    
}
