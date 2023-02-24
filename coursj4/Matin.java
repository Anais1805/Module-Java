package coursj4;

public class Matin {
    //type primitif et wrapper
    public static void main(String[]args){
    int monInt = 4;
    Integer monInstanceDeInt = Integer.valueOf(4);

    Integer nouvelInt = 5;
    byte conversionEnByte = nouvelInt.byteValue();

    //boxing d'un boulean 
    Boolean monBooleen = true;
    Double pi = 3.14;

    int somme = monInstanceDeInt.intValue() + nouvelInt.intValue();
    // ligne un peu lourde par le unboxing on peut écrire directement
    int somme1 = monInstanceDeInt + nouvelInt;
    // somme 1 appelle les mêmes méthodes  de manière cachée.
    int maValeur = Integer.parseInt("43");

    }
}
