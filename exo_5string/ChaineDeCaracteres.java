package exo_5string;

public class ChaineDeCaracteres {
    public static void main(String[] args) {

        // Définition et déclaration d'une chaîne valant "Hey ?"
        String coucou = "Hey ?";
        // Définition et déclaration d'une chaîne valant "What's wrong with you ?"
        String grumpf = "What's wrong with you ?";
        // Affichage de : "Hey ? What's wrong with you ?" dans la console
        System.out.println(coucou + ' ' + grumpf);
        System.out.println(grumpf.substring(4, 5));
        System.out.println(grumpf.length());
        System.out.println(grumpf.substring(13, 23).toUpperCase());
   
    }

}
