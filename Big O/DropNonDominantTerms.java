/*                              DropNonDominantTerms
--> n--> Infinity
--> o(n^2) + O(n) = O(n^2 + n) = o(n^2)
 */

public class DropNonDominantTerms {
    public static void printNumbers(int n) {
        for (int i = 0; i < n; i++) {                   // ---------> O(n^2)
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }

        for (int i = 1; i <= n; i++) {        // ---------> O(n)
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}