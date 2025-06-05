
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestApartmentBlockGoogle {

    public int getSum(HashMap<String, Integer> map) {
        int dist = 0;

        for (var entry : map.entrySet()) {

            dist = dist + entry.getValue();
        }

        return dist;

    } //Helper function to add all the values in a <String, Integer> hashmap

    public List<Integer[]> getDist(List<Map<String, Boolean>> blockInput) {

        int prev_gym_dist = Integer.MIN_VALUE;
        int prev_school_dist = Integer.MIN_VALUE;
        int prev_store_dist = Integer.MIN_VALUE;

        List<ArrayList<Integer>> output = new ArrayList<>();

        for (int i = 0; i < blockInput.size(); i++) {
            Map<String, Boolean> block = blockInput.get(i); // Get the i-th block

            for (Map.Entry<String, Boolean> entry : block.entrySet()) {
                String place = entry.getKey();
                boolean isThere = entry.getValue();

                if (isThere) {
                    output.add(new ArrayList<>(Arrays.asList(1, 0, 0)));

                }

            }
        }

        return 0;
    }

}
