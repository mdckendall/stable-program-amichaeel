import java.util.ArrayList;
public class Stable {
    public String address;
    ArrayList<Horse> horses = new ArrayList<>();
    
    // Default constructor
    public Stable(){

    }

    // Method to add new horse to array list
    public void addHorse(Horse horse) {
        horses.add(horse);
    }
}