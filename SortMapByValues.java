//7. Sort Map by Values. Sort a HashMap based on values.

package Task;

import java.util.*;

public class SortMapByValues {

    public static void main(String[] args) {

        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Orange", 40);
        map.put("Mango", 10);

        // Convert map entries to a list
        List<Map.Entry<String, Integer>> entryList =
                new ArrayList<>(map.entrySet());

        // Sort the list by values (Ascending)
        entryList.sort(Map.Entry.comparingByValue());

        //OR
        //Sort the list by Values (Descending)
        //entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Store sorted entries in LinkedHashMap
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print sorted map
        System.out.println("Map sorted by values:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}


//HashMap → unordered

//LinkedHashMap → maintains insertion order

//Map.Entry.comparingByValue() simplifies sorting