//6.  Frequency Using HashMap. Count the frequency of each element in a list using HashMap

package Task;

import java.util.HashMap;

public class FrequencyUsingHashMap {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 2};

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            // If num is already in map, increment count; else put 1
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }

        // Print frequency of each element
        System.out.println("Frequency of each element:");
        for (int key : freqMap.keySet()) {
            System.out.println(key + " → " + freqMap.get(key));
        }
    }
}
