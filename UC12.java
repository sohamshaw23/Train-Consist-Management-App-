import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    private String type;   // e.g., Rectangular, Cylindrical
    private String cargo;  // e.g., Coal, Petroleum, Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Prepare a list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Grain"));
        // Uncomment below to test invalid case:
        // goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Safety compliance check using allMatch
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> {
                    if (b.getType().equals("Cylindrical")) {
                        return b.getCargo().equals("Petroleum");
                    }
                    return true; // Non-cylindrical bogies can carry any cargo
                });

        // Display result
        System.out.println("Goods Bogies in Train:");
        goodsBogies.forEach(System.out::println);

        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("\nTrain is NOT SAFETY COMPLIANT ❌");
        }
    }
}
