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
        this();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static long getCpt() {
        return cpt;
    }

    public static void setCpt(long cpt) {
        User.cpt = cpt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "Nom client: " + firstName + " " + lastName + " agé de " + age + "ans." ;
    }
}
