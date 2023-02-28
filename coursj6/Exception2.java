package coursj6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception2 {

    public static void main(String[] args) {
        // Appel de methode qui ne marche pas top
        // et utilisation des méthodes de l'exception
        try {
            methodeQuiMarchePasTop();
        } catch (MonException monException) {
            System.out.println("Erreur ! ");
            if (monException.isGrave()) {
                System.out.println("L'erreur est grave");
            } else {
                System.out.println("L'erreur n'est pas grave");
            }
        }

        // try catch de lecture de smon fichier
        File monFichier = new File("fichier-inconnu.java");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(monFichier);
            byte[] fileBytes = fileInputStream.readAllBytes();
            System.out.println("J'ai lu le fichier : son premier octet valait : " + fileBytes[0]);
        } catch (FileNotFoundException fe) {
            System.out.println("Désolé, le fichier n'existe pas ! ");
        } catch (IOException ioe) {
            System.out.println("Désolé, problème de lecture ! ");
        }
        // try with resources
        // permet de fermer des ressources après utilisation
        File monAutreFichier = new File("mon-fichier.txt");
        try (FileInputStream fis = new FileInputStream(monAutreFichier)) {
            fis.read();
            byte[] fileBytes = fileInputStream.readAllBytes();
            System.out.println("J'ai lu le fichier");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }

    public static void methodeQuiMarchePasTop() throws MonException {
        throw new MonException("Bon ben là, ça marche pas !", true);
    }

}
