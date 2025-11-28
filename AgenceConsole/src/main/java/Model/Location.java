package Model;

public class Location {
    private static long cpt = 0;

private long id;
   private User user;
   private Vehicule vehiculeLoué;
   private int nbJours;

    public Location() {
        this.id = cpt++;
    }

    public Location(User user, Vehicule vehiculeLoué, int nbJours) {
        this.user = user;
        this.vehiculeLoué = vehiculeLoué;
        this.nbJours = nbJours;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public String toString() {
        if (user == null || vehiculeLoué == null){
            return "Location invalide (client ou véhicule manquant)";
        }else {
            return "Location{" +
                    "user=" + user +
                    ", vehiculeLoué=" + vehiculeLoué +
                    ", nbJours=" + nbJours +
                    '}';
        }
    }
}
