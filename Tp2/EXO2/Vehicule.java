public abstract class Vehicule {

    protected int position;
    protected int vitesse; // current speed
    protected int vitesseMax;
    protected boolean hs; // true = hors service

    // 2. Constructor
    public Vehicule(int vitesseMax) {

        this.vitesseMax = vitesseMax;

    }
}