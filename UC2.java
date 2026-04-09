import java.util.ArrayList;

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        ArrayList<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("After Removal: " + passengerBogies);

        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Is Sleeper present? " + exists);

        System.out.println("Final Bogie List: " + passengerBogies);
    }
}
