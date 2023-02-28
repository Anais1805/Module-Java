package coursj6;

public enum TypePizza {
    MARGHARITA(false), QUATRE_FROMAGE(false), REINE(false), NORVEGIENNE(true);

    //il est possible de préciser notre énumération
    // mais pas conseillé
    private boolean allergenes;

    private TypePizza(boolean allergenes){
        this.allergenes = allergenes;
    }

    public boolean isAllergenes() {
        return allergenes;
    }

    public void setAllergenes(boolean allergenes) {
        this.allergenes = allergenes;
    }
}
