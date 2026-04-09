import java.util.*;
import java.util.stream.Collectors;

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
        // Create a list of bogies (both passenger and goods)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 56));
        bogies.add(new Bogie("First Class", "Passenger", 24));
        bogies.add(new Bogie("Rectangular Cargo", "Goods", 10000));
        bogies.add(new Bogie("Cylindrical Cargo", "Goods", 8000));

        // Group bogies by type using Collectors.groupingBy
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // Display grouped bogies
        System.out.println("Grouped Bogies by Type:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\n" + entry.getKey() + " Bogies:");
            entry.getValue().forEach(System.out::println);
        }
    }
}

