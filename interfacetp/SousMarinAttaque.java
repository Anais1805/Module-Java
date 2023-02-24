package interfacetp;

import simulateur.BateauMilitaire;
import simulateur.piece.Coque;
import simulateur.piece.Moteur;

public class SousMarinAttaque extends BateauMilitaire implements Submersible{

    public SousMarinAttaque(String nom, Coque coque, Moteur moteur) {
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
    
}
