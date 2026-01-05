//10. Check Anagram Using Collection. Check whether two strings are anagrams using collections.

package Task;

import java.util.*;

public class AnagramUsingCollection {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        // Step 1: Check length
        if (str1.length() != str2.length()) {
            System.out.println("Two strings are Not Anagrams");
            return;
        }

        // Step 2: Convert strings to lists
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for (char c : str1.toCharArray()) {
            list1.add(c);
        }
        for (char c : str2.toCharArray()) {
            list2.add(c);
        }

        // Step 3: Sort both lists
        Collections.sort(list1);
        Collections.sort(list2);

        // Step 4: Compare
        if (list1.equals(list2)) {
            System.out.println("Two strings are Anagrams");
        } else {
            System.out.println("Two strings are Not Anagrams");
        }
    }
}
