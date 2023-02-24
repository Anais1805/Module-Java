package simulateur.animal;

public class ChauveSouris extends Animal implements Mammifere, Volant{
    private String nom;
    @Override
    public void allaiter() {
        // TODO Auto-generated method stub
        System.out.println("J'allaite mon petit");
        
    }

    @Override
    public void vole() {
        // TODO Auto-generated method stub
        System.out.println("Je vole");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
