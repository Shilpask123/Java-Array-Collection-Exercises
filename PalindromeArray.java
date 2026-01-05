//4. Check Palindrome Array. Check whether an integer array is a palindrome.

package Task;

public class PalindromeArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};

        if (isPalindrome(arr)) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is NOT a palindrome.");
        }
    }

    public static boolean isPalindrome(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false; // mismatch → not palindrome
            }
            start++;
            end--;
        }

        return true; // all matched → palindrome
    }
}
