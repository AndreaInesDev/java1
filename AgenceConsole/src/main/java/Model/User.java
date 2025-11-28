package Model;

public class User {
    private static long cpt = 0;

    private long id;
    private String firstName;
    private String lastName;
    private int age;


    public User() {
        this.id = cpt++;
    }

    public User(long id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString(){
        return "Nom client: " + firstName + " " + lastName + " agé de " + age + "ans." ;
    }
}
