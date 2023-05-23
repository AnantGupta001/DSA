/*              Big O(N) time complexity - Linear

--> Time Complexity will grow to the direct proportion of input data.
--> Real Life example : If I want to choose a specific card ( 10 of Hearts ),
                        then I have to go through each card until I find this card.
 */

public class Linear {
    public void printNumber(int n) {
        for (int i = 1; i <= n; i++) {        // ---------> O(N)
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Linear l = new Linear();
        l.printNumber(5);
    }
}
