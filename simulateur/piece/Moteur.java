package simulateur.piece;

public class Moteur {
    private final int puissance;
    private final int consommation;

    public int getPuissance() {
        return puissance;
    }
    public int getConsommation() {
        return consommation;
    }
    // intéressant de faire un constructeur ici 
    // car permet de déterminer des valeurs particulières pour chaque instance
    // plutôt que les mêmes pour toutes les instances de la classe
    // (cela en affectant dès le début des valeurs aux attributs de la classe
    // qui seront fixes puisque final)
    public Moteur(int puissance, int consommation){
        this.puissance= puissance;
        this.consommation = consommation;
    }
}
