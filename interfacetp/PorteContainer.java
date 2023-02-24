package interfacetp;

import simulateur.BateauCivil;
import simulateur.piece.Coque;
import simulateur.piece.Moteur;

public class PorteContainer extends BateauCivil implements Cargo {

    public PorteContainer(String nom, Coque coque, Moteur moteur) {
        super(nom, coque, moteur);
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
