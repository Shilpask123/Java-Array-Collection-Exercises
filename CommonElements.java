//9. Find Common Elements Between Two Lists. Find common elements between two ArrayList objects.

package Task;

import java.util.*;

public class CommonElements {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));

        // Find common elements
        ArrayList<Integer> common = new ArrayList<>(list1);
        common.retainAll(list2);

        System.out.println("Common elements:");
        System.out.println(common);
    }
}
