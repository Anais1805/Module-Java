package simulateur;
public class Coque {
    private int pointsDeVie;
    private int pointsDeVieMax;

    
    public Coque(int pointsDeVieMax) {
        this.pointsDeVie = pointsDeVieMax;
        this.pointsDeVieMax = pointsDeVieMax;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getPointsDeVieMax() {
        return pointsDeVieMax;
    }

    public void setPointsDeVieMax(int pointsDeVieMax) {
        this.pointsDeVieMax = pointsDeVieMax;
    }
}