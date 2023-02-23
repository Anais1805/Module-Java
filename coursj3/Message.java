package coursj3;
    // Classe Message est un POJO : Plain Old Java Object
    // un message XML langage de balise
    /* <message>
        <taille>3</taille>
        <emetteur>Jean</emetteur>
        <destinataire>Sophie</destinataire>
        <message> salut</message>
    </message>
     */
    // Un POJO est un standard Java 
    /*Il a un constructeur public et sans parametre
     * A un getter et un setter par attribut
     */
public class Message {
    private int taille;
    private String message;
    private String emetteur;
    private String destinataire;
    public int getTaille() {
        return taille;
    }
    public void setTaille(int taille) {
        this.taille = taille;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getEmetteur() {
        return emetteur;
    }
    public void setEmetteur(String emetteur) {
        this.emetteur = emetteur;
    }
    public String getDestinataire() {
        return destinataire;
    }
    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }
}
