
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

public class Q1 {



    
    public static String destination(List<List<String>> paths) {
        String output = "";

        HashMap<String, String> cityAndDirectDestination = new HashMap<>();

        for (int i = 0; i < paths.size(); i++) { // Corrected the loop condition here
            List<String> path = paths.get(i);
            int length = path.size();
            for (int q = 0; q < length - 1; q++) { // Changed 'i' and 'i+1' to 'q' and 'q+1'
                cityAndDirectDestination.put(path.get(q), path.get(q + 1));
            }
        }

        for (String val : cityAndDirectDestination.values()) {
            if (!cityAndDirectDestination.containsKey(val)) {
                output = val;
                break;
            }
        }

        return output;
    }
    
    public static void main(String[] args) {
        List<List<String>> paths = Arrays.asList(
            Arrays.asList("London", "New York"),
            Arrays.asList("New York", "Lima"),
            Arrays.asList("Lima", "Sao Paulo")
        );

        System.out.println("Destination City: " + destination(paths));
    }
}

    
