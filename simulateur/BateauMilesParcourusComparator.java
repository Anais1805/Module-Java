package simulateur;

import java.util.Comparator;

public class BateauMilesParcourusComparator implements Comparator<Bateau>{

//Méthode renvoie une valeur négative si bateau1 est avant bateau2 dans le tri
// Méthode renvoie une valeur positive si b1 est arpès b2
// Sinon 0 
    @Override
    public int compare(Bateau bateau1, Bateau bateau2) {
       return (int) (bateau1.getMilesParcourus() - bateau2.getMilesParcourus());
    
}
}