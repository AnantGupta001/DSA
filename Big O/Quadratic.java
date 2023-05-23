/*                  Big O(N^2) Time Complexity - Quadratic

--> O(n) * O(n) = O(n*n) = o(n)
--> Worst Time Complexity
--> Real Life Example : Let's say I pick a Card (3 of hearts) and to get cards with the same no.
                        We need to search through the deck getting all the duplicates.
                        Once we are sure getting all the duplicates then,
                        We continue doing it for the other cards.
 */

public class Quadratic {
    public static void printNumbers(int n) {
        for (int i = 0; i < n; i++) {                   // -------> O(n)
            for (int j = 0; j < n; j++) {               // -------> O(n)
                System.out.println(i + " " + j);
            }
        }
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}
