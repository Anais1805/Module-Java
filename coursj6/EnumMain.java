package coursj6;

public class EnumMain {
    public static void main(String[] args){
        TypePizza choix1 = TypePizza.MARGHARITA;
        System.out.println(choix1);

        if(choix1 == TypePizza.QUATRE_FROMAGE){
            System.out.println("miam miam");
        } else if (choix1 == TypePizza.MARGHARITA){
            System.out.println("miam miam mais j'ai encore faim");
        }

        switch (choix1) {
            case NORVEGIENNE -> {
                System.out.println("C'est bon le saumon !");
            }
            case QUATRE_FROMAGE -> {
                System.out.println("Trop bon le fromage");
            }
            case REINE -> {
                System.out.println("Rien de tel qu'un classique !");
            }
            case MARGHARITA -> {
                System.out.println("Retour aux sources");
            }
            default -> {
                System.out.println("Vive les pizzas !");
            }
        }
        // Afficher toutes les valeurs de l'énimération de pizza
        System.out.println("Mes choix de pizzas sont : ");
        for(TypePizza choixPizza : TypePizza.values()){
            System.out.println(choixPizza);
        }

        String maChaine = "MARGHARITA";
        TypePizza typeFromString = TypePizza.valueOf(maChaine);
        System.out.println("TypeFromString vaut = " + typeFromString);
        System.out.println("Cette pizza a-t-elle des allergenes ? " + TypePizza.NORVEGIENNE + " :" +TypePizza.NORVEGIENNE.isAllergenes());

    }
    

   
}
