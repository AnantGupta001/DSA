/*                          Space Complexity
    --> In this code memory is stacking to get the previous value.
        sumNumbers(5) --> 10 + 5 = 15
            sumNumbers(4) --> 6 + 4 = 10
                sumNumbers(3) --> 3 + 3 = 6
                    sumNumbers(2) --> 1 + 2 = 3
                        sumNumbers(1) --> 0 + 1 = 1
                            sumNumbers(0) --> 0
        Hence Space Complexity = O(n).

 */

public class Space {
    public static int sumNumbers(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumNumbers(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers(5));
    }
}
