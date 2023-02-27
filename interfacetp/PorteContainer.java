package interfacetp;

import simulateur.BateauCivil;
import simulateur.piece.Coque;
import simulateur.piece.Moteur;

public class PorteContainer extends BateauCivil implements Cargo {
    int tonnage;
    int decharge;
    public PorteContainer(String nom, Coque coque, Moteur moteur) {
        super(nom, coque, moteur);
    }

    @Override
    public void chargeTonnage(int tonnage) {
        // TODO Auto-generated method stub
        this.tonnage += tonnage;
    }

    @Override
    public int dechargeTonnage() {
        // TODO Auto-generated method stub
        int decharge = this.tonnage;
        decharge = 0;
        return 0;
    }
    
}
