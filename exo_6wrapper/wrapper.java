package exo_6wrapper;

public class wrapper {
    public static void main(String[] args) {
        // Boxing
        // boxing d'un int en Integer
        Integer monInt = 3;
        // Boxing d'un boolean (true) en Boolean
        Boolean monBoolean = true;
        // Création d'un int à partir d'une chaîne de caractères
        Integer monNum = Integer.parseInt("64");
        // Passage de ce int en Integer
        int nouveauNum = monNum;

        // Bonus :
        // transformation sans boxing et unboxing
        int numero = Integer.valueOf(4);
        // Boxing d'un boolean (true) en Boolean
        boolean vv = Boolean.valueOf(true);
        // Création d'un int à partir d'une chaîne de caractères
        String hello = "33";
        int valeur = Integer.parseInt(hello);
        System.out.println(valeur);
        // Passage de ce int en Integer
        int valeur2 = Integer.valueOf(valeur);
        System.out.println(valeur);
    }
}
