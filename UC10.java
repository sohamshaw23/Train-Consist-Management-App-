import java.util.ArrayList;
import java.util.List;

class Bogie {
    private String name;
    private String type;   // Passenger or Goods
    private int capacity;

    public Bogie(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + type + ") -> Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Create a list of bogies (Passenger + Goods)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 56));
        bogies.add(new Bogie("First Class", "Passenger", 24));
        bogies.add(new Bogie("Rectangular Cargo", "Goods", 10000));
        bogies.add(new Bogie("Cylindrical Cargo", "Goods", 8000));

        // Compute total seating capacity (only Passenger bogies)
        int totalSeats = bogies.stream()
                .filter(b -> b.getType().equals("Passenger"))   // consider only passenger bogies
                .map(Bogie::getCapacity)                        // extract capacity
                .reduce(0, Integer::sum);                       // sum capacities

        // Display total seating capacity
        System.out.println("Total Seating Capacity in Train: " + totalSeats);
    }
}
