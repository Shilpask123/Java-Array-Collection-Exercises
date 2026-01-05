//2.Find Duplicate Elements. Find all duplicate elements in an integer array.

package Task;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        System.out.print("Duplicate elements: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; // avoid printing same duplicate again (stop inner loop because we already found duplicate)
                }
            }
        }
    }
}
