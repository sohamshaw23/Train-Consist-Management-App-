import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Regex patterns
        String trainIdPattern = "TRN-\\d{4}";       // Train ID must be TRN- followed by 4 digits
        String cargoCodePattern = "PET-[A-Z]{2}";   // Cargo Code must be PET- followed by 2 uppercase letters

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainIdPattern);
        Pattern cargoPattern = Pattern.compile(cargoCodePattern);

        // User input
        System.out.print("Enter Train ID: ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = scanner.nextLine();

        // Validate Train ID
        Matcher trainMatcher = trainPattern.matcher(trainId);
        if (trainMatcher.matches()) {
            System.out.println("Valid Train ID: " + trainId);
        } else {
            System.out.println("Invalid Train ID format! Expected format: TRN-1234");
        }

        // Validate Cargo Code
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);
        if (cargoMatcher.matches()) {
            System.out.println("Valid Cargo Code: " + cargoCode);
        } else {
            System.out.println("Invalid Cargo Code format! Expected format: PET-AB");
        }

        scanner.close();
    }
}
