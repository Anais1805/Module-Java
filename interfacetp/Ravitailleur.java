package interfacetp;
import simulateur.*;
import simulateur.piece.Coque;
import simulateur.piece.Moteur;

public class Ravitailleur extends BateauMilitaire implements Cargo{

    public Ravitailleur(String nom, Coque coque, Moteur moteur) {
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
