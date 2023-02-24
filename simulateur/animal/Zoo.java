package simulateur.animal;

public class Zoo {
  
    public void faitVoler(ChauveSouris chauvesouris){
        System.out.println(chauvesouris.getNom() + " vole !");
    }
    public static void main(String[]args){
        ChauveSouris batman = new ChauveSouris();
        batman.setNom("batman");
        Zoo zoo = new Zoo();
        batman.allaiter();
        zoo.faitVoler(batman);
    }
}
