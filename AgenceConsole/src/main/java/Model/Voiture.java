package Model;

public class Voiture extends  Vehicule{
   private int nbPortes;

   public  Vehicule(){};
    public Vehicule(String model, String marque, int annee, TypeCarburant carburant, int nbPortes) {
        super(model, marque, annee, carburant);
        this.nbPortes = nbPortes;
    }

    public int getNbPortes() {
        return nbPortes;
    }

    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }

    @Override
    public  String toString(){
        return "Voiture: " + getModel() + " - " + getMarque() + " - (" + getAnnee() + ")"
                + " Nbres de portes " + nbPortes;
    }
}
