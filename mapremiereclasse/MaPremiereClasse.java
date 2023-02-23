package mapremiereclasse;
public class MaPremiereClasse {
    private int id;
    private String nom;
    private String prenom;
   // permet de figurer une association durable
    private MaSecondeClasse instance;

    public int getId(){
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void methode1(){
        //si je créé une instance de MaSecondeClasse ici elle n'existe que le temps
        // de l'utilisation de la méthode donc = dépendance simple.
        //Ici, on utilise l'instance de l'association déclarée plus haut.
        instance.affiche();
    }
}