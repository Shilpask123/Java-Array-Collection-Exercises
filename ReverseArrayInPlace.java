//1.Reverse an Array In-Place. Reverse an array without using another array.

package Task;

public class ReverseArrayInPlace {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        //Calling method to reverse the array in-place
        reverseArray(arr);

        System.out.println("Reversed array (in-place):");
        // Print reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Method to reverse array in-place (without using another array)
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}

