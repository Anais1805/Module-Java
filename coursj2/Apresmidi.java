package coursj2;

public class Apresmidi {
    public static void main(String[] args){
    float monFloat = 3f;
    // conversion sans problème car on ne perd rien
    double monDouble = monFloat;
//ici si on veut affecter le double au float, pas content car float a une plus 
//petite capacité
    //monFloat = monDouble;
    //on peut cependant forcer la conversion si on sait que notre valeur
    // fonctionne car petite valeur
    monFloat = (float) monDouble;
    // Attention, si ma valeur ne rentre pas, elle va casser.

    //Object est la classe parente de toutes
    Object monObjet;
    //Instanciation :
    monObjet = new Object();
    Object monObjet2 = new Object();

    String maChaine = new String("coucou");
    System.out.println(maChaine);
    // une fois un objet d'un certain type instancié, on peut utiliser ses méthodes.
    String maChaineEnMaj = maChaine.toUpperCase();
    System.out.println(maChaineEnMaj);

    //Concaténation : 
    String concatenee = "salut" + "les copains";
    }
}
