//8. Remove Duplicates While Preserving Order. Remove duplicate elements from a list while preserving insertion order.

package Task;

import java.util.*;

public class RemoveDuplicatesPreserveOrder {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40, 30);

        // Remove duplicates while preserving order
        List<Integer> result = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println("List after removing duplicates:");
        System.out.println(result);
    }
}


//OR
// import java.util.*;
//
//public class RemoveDuplicatesManual {
//
//    public static void main(String[] args) {
//
//        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5);
//        List<Integer> result = new ArrayList<>();
//
//        for (Integer item : list) {
//            if (!result.contains(item)) {
//                result.add(item);
//            }
//        }
//
//        System.out.println(result);
//    }
//}