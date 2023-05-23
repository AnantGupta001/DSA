/*              Big O(1) time complexity - order of one OR Constant

--> For any given input, execution time will not change.
--> Most Efficient Big O
--> Real Life example : Choosing a card from a deck.
 */

public class Constant {
    public int addition(int n) {
        return n + n;                // -------> O(1)
    }

    public static void main(String[] args) {
        Constant c = new Constant();
        System.out.println(c.addition(5));
    }
}