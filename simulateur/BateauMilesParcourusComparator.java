package simulateur;

import java.util.Comparator;

public class BateauMilesParcourusComparator implements Comparator<Bateau>{

//Méthode renvoie une valeur négative si bateau1 est avant bateau2 dans le tri
// Méthode renvoie une valeur positive si b1 est arpès b2
// Sinon 0 
    @Override
    public int compare(Bateau bateau1, Bateau bateau2) {
       return (int) (bateau1.getMilesParcourus1() - bateau2.getMilesParcourus1());
    
}
}

//fonctionnait mais ne marche plus car ajout d'une exception
// dans le code de getMilesParcourus
//donc remplacement par getMilesParcourus1