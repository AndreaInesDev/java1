package Model;

public class Location {
   private User user;
   private Vehicule vehiculeLoué;
   private int nbJours;

    public Location(User user, Vehicule vehiculeLoué, int nbJours) {
        this.user = user;
        this.vehiculeLoué = vehiculeLoué;
        this.nbJours = nbJours;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicule getVehiculeLoué() {
        return vehiculeLoué;
    }

    public void setVehiculeLoué(Vehicule vehiculeLoué) {
        this.vehiculeLoué = vehiculeLoué;
    }

    public int getNbJours() {
        return nbJours;
    }

    public void setNbJours(int nbJours) {
        this.nbJours = nbJours;
    }

    public String toString(){

        if (user == null || vehiculeLoué == null) {
            return "Location invalide (client ou véhicule manquant)";
        } else{

            return "Location de " + user.getfirsName() + " " + user.getlastName() + " pour " + nbJours + " jours.\n"
                    + " véhicule loué : " + vehiculeLoué;
        }

    }
}
