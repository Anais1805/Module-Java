package exo_12exception;

public class Exceptions {
 
    public static void main(String[] args) {
        int resultat = 0;
        // Décommenter la ligne ci-dessous et tenter de faire compiler le code
        // en gérant l'exception
        try {
            resultat = calcule(4, 5);
        }catch (CalculException calculE){
            System.out.println(calculE.getMessage());
        }
    }

    public static int calcule(int a, int b) throws CalculException {
        throw new CalculException("Une erreur est survenue");
    }


}