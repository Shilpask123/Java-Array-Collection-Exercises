//3. Move Zeros to End. Move all zero elements to the end of the array while maintaining order of non-zero elements.

package Task;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeros(arr);

        System.out.print("Array after moving zeros to end: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeros(int[] arr) {
        int nonZeroIndex = 0;

        // Step 1: Move all non-zero numbers to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        // Step 2: Fill remaining positions with 0
        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}

