package Model;
import java.util.ArrayList;

public class Agence {
    private static long cpt = 0;

    private long id;
    ArrayList<Vehicule> vehicules;

    public Agence() {
        this.id = cpt++;
    }

    public Agence(int capacite){
        this.vehicules = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /*public void ajouterVehicule(Vehicule v){
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
    }*/
}
