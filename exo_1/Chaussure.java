package exo_1;
public class Chaussure{
    private String nom;
    private Integer pointure;
    private boolean gauche = true;
    private Magasin magasin;

    public String getNom(){
        return nom;
    }
    public Integer getPointure() {
        return pointure;
    }

    public boolean isGauche() {
        return gauche;
    }

    public void marche() {
        System.out.println("Je marche !");
    }

}