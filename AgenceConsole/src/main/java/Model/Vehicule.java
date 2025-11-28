package Model;

abstract class Vehicule {
    private String model;
    private String marque;
    private  int annee;
    TypeCarburant carburant;


    public Vehicule(String model, String marque, int annee, TypeCarburant carburant) {
        this.model = model;
        this.marque = marque;
        this.annee = annee;
        this.carburant = carburant;
    }
    public  void afficherInfos(){};

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }



    public  String toString(){
        return marque + " - " + model + " (" + annee + ") - " + carburant;
    }
}
