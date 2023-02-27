package coursj5;

import simulateur.Bateau;

public class Matin {
    public static void main(String[] args){
        // déclaration d'un tableau sans l'alimenter : 
        int monPremierTab[];
        int monDeuxiemeTab[] = new int[4];
        // Affecattion des valeurs 
            // index commence à 0 et va jusqu'à n-1
        monDeuxiemeTab[0] = 4;
        System.out.println("La valeur du premier index est :" + monDeuxiemeTab[0]);
        System.out.println("La valeur du dernier index est :" + monDeuxiemeTab[3]);
        //Afichage d'une valeur non attribuée d'un tab
        //(cela est égal à sa valeur par défaut si on ne l'a pas spécifié)

        // Vouloir accéder à un indx non inclus génère une exception
        // System.out.println("La valeur du dernier index est :" + monDeuxiemeTab[5]);

        // Déclaration d'un tab sans déclarer son nom d'éléments+alimentation
        String mesChaines[] = {"ok", "ko"};
        Bateau bateaux[] = {new Bateau("Coucou", null, null), new Bateau("Hello", null, null)};

        //Parcours du tab : 
        System.out.println("Longueur tab:" + mesChaines.length);
        //Attention length sans ().
        for(int i =0; i< mesChaines.length; i++){
            System.out.println("L'élément " + i + " est : "+ mesChaines[i]);
        }

        //Tableau à deux dimensions :  2 paires de crochets
        // on peut ajouter autant de dimensions que l'on veut
        String echiquier[][] = new String[3][3];
        // J'ai créé un tab de 8 éléments et chaque élément en comprend 8
        // Equivalent à 8 lignes 8 colonnes. 
        //Affichage : 
        System.out.println("La première dimension du tab echiquier à la taille " + echiquier.length);

        //Pour le parcourir, il faut une boucle imbriquée : 
        for(int i =0; i<echiquier.length; i++){
            String[] colonne = echiquier[i];
            // On fait une variable colonne qui permet de transformer les données
            // en String et la deuxième boucle itère sur la longueur 
            // de ce premier tableau qui correspond au nombre de colonnes
            for(int j= 0; j<colonne.length; j++){
                // colonne[j] = "("+ i + j +")";
                System.out.println("A la colonne " + i + " et à la ligne " + j+" correspond la valeur : " +  echiquier[i][j]+ " ou " + colonne[j]);
                // On peut aussi directement préciser les coordonnées d'une valeur
                // echiquuer [i][j] = j'accède à la valeur j de la colonne i
            }
        }
    }
}
