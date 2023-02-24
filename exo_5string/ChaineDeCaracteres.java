package exo_5string;

public class ChaineDeCaracteres {
    public static void main(String[] args) {

        // Définition et déclaration d'une chaîne valant "Hey ?"
        String coucou = "Hey ?";
        // Définition et déclaration d'une chaîne valant "What's wrong with you ?"
        String grumpf = "What's wrong with you ?";
        // Affichage de : "Hey ? What's wrong with you ?" dans la console
        System.out.println(coucou + ' ' + grumpf);
        System.out.println(grumpf.charAt(4));
        // ou
        System.out.println(grumpf.substring(4, 5));
        System.out.println(grumpf.length());
        int index = grumpf.length()-10;
        System.out.println(grumpf.substring(index));
        //substring fonctionne donc aussi en indiquant un seul paramèter, l'index de départ et va jusqu'au bout de la chaine
        //ou
        System.out.println(grumpf.substring(13, 23));
        System.out.println(grumpf.substring(0, 12) + ' ' + grumpf.substring(grumpf.length()-10, grumpf.length()).toUpperCase());

    }

}
