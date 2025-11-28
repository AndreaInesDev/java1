package Model;

public class Moto extends  Vehicule {
    private String cylindre;
    public Vehicule(String model, String marque, int annee, TypeCarburant carburant String cylindre){
        super(model, marque, annee, carburant);
        this.cylindre= cylindre;
    }

    public  String toString(){
        return "Voiture: " + getModel() + " - " + getMarque() + " - (" + getAnnee() + ")"
                + " Type de cylindre " + cylindre;
    }
}
