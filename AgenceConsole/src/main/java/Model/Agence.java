package Model;

public class Agence {
    ArrayList <Vehicule> vehicules;

    public Agence(int capacite){
        this.vehicules = new ArrayList<>();
    }

    public void ajouterVehicule( Vehicule v){
        vehicules.add(v);
    }

    public void afficherVehicule(){
        System.out.println("Voiture disponibles : \n");

        if (vehicules.isEmpty()) {
            System.out.println("⚠ Aucun véhicule disponible");
        } else {

            for(Vehicule v : vehicules){
                v.afficherInfos();
            }
        }
    }
}
