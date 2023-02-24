package exo_6wrapper;

public class wrapper {
    //Boxing
Integer monInt = 3;
Boolean monBoolean = true;
Integer monNum = Integer.parseInt("64");
int nouveauNum = monNum;


//Bonus : 
    // transformation sans boxing et unboxing
    int numero = Integer.valueOf(4);
    // Boxing d'un boolean (true) en Boolean
    boolean vv = Boolean.valueOf(true);
    // Création d'un int à partir d'une chaîne de caractères
    String hello = "hello";
    int valeur = Integer.parseInt(hello);
    // Passage de ce int en Integer
    int valeur2 = Integer.valueOf(valeur);

}
