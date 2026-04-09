import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Create a LinkedHashSet to represent the train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies in sequence
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie
        trainFormation.add("Sleeper");  // This will be ignored automatically

        // Display the final formation order
        System.out.println("Final Train Formation:");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}
