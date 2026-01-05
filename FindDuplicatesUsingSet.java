//----2.Find Duplicate Elements. Find all duplicate elements in an integer array. using HashSet---

package Task;

import java.util.HashSet;

public class FindDuplicatesUsingSet {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        HashSet<Integer> seen = new HashSet<>();

        System.out.print("Duplicate elements: ");

        for (int num : arr) {
            if (!seen.add(num)) {
                System.out.print(num + " ");
            }
        }
    }
}

//OR
//import java.util.Arrays;
//
//public class FindDuplicatesBySorting {
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 2, 4, 5, 1};
//
//        Arrays.sort(arr);
//
//        System.out.print("Duplicate elements: ");
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == arr[i + 1]) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//}
