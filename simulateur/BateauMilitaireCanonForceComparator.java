package simulateur;

import java.util.Comparator;

public class BateauMilitaireCanonForceComparator implements Comparator<BateauMilitaire>{

    @Override
    public int compare(BateauMilitaire b1, BateauMilitaire b2) {
        int result = b2.getForceCanon() - b1.getForceCanon();
        return result;
    }
    
}
