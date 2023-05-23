/*                  Big O(log n) Time Complexity - Logarithmic
--> Let's say We have to find 1 in this array : [1,2,3,4,5,6,7,8]
    {Linear Search - O(N) - inefficient}
    step - 1 : Divide it in 2 and keep important array ... [1,2,3,4] , [5,6,7,8] - x
    step - 2 : Divide it in 2 and keep important array ... [1,2] , [3,4] - x
    step - 3 : Divide it in 2 and keep important array ... [1] , [2] - x
    # DIVIDE AND CONQUER TECHNIQUE
    log2^8 = 3
 */

public class Logarithmic {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;

        int result = binarySearch(myArray, target);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}