import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Create a HashMap to store bogie-capacity information
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert bogies with their capacities
        bogieCapacityMap.put("Sleeper", 72);       // 72 seats
        bogieCapacityMap.put("AC Chair", 56);      // 56 seats
        bogieCapacityMap.put("First Class", 24);   // 24 seats
        bogieCapacityMap.put("Rectangular Cargo", 10000); // 10,000 kg load
        bogieCapacityMap.put("Cylindrical Cargo", 8000);  // 8,000 kg load

        // Iterate over the map and display bogie-capacity details
        System.out.println("Train Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }
}
