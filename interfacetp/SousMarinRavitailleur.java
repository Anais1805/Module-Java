package interfacetp;

import simulateur.BateauMilitaire;
import simulateur.piece.Coque;
import simulateur.piece.Moteur;

public class SousMarinRavitailleur extends BateauMilitaire implements Submersible, Cargo {

    public SousMarinRavitailleur(String nom, Coque coque, Moteur moteur) {
        super(nom, coque, moteur);
    }

    @Override
    public void faitSurface() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void plonge() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void chargeTonnage(int tonnage) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int dechargeTonnage() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
