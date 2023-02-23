package simulateur.piece;

public class Moteur {
    private final int puissance ;
    private final int consommation;

    public int getPuissance() {
        return puissance;
    }
    public int getConsommation() {
        return consommation;
    }
    public Moteur(int puissance, int consommation){
        this.puissance= puissance;
        this.consommation = consommation;
    }
}
