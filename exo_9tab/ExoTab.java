package exo_9tab;

import java.util.Random;

public class ExoTab {
    public static void main(String[] args) {

        // L'instruction ci-dessous génère un float aléatoire de 0 à 100.
        float randomFloat = new Random().nextFloat() * 100;

        // Créer un tableau de 10 floats
        float[] myFloats = new float[10];
        for(int i = 0; i<myFloats.length; i++){
            // Le remplir avec des float aléatoires
            float randomFloatt = new Random().nextFloat() * 100;
            myFloats[i] = randomFloatt;
            // Afficher le résultat sur la console
            System.out.println("Mes chiffres aléatoires sont : " + myFloats[i]);
        }
        // Créer un nouveau tableau de 12 floats
        float[] nouveauTab = new float[12];
        // y copier les dix éléments du premier tableau.

        for(int i = 0; i<myFloats.length; i++){
           nouveauTab[i] = myFloats[i];
        }
        // Mettre deux nouveaux float aléatoires dans les deux dernières 'cases
        nouveauTab[10] = new Random().nextFloat() * 100;
        nouveauTab[11] = new Random().nextFloat() * 100;
        // Afficher le nouveau tableau
        for(int i = 0; i<nouveauTab.length; i++){
            System.out.println("2e tab, valeur " + i + " : " + nouveauTab[i]);
        }

    }

}
