/*                                 Drop Constant

--> O(n) + O(n) = O(n+n) = O(2n) = o(n)
--> It is possible that O(n) code is faster than O(1) for specific input.
--> As n--> ∞, We drop the constant.

 */

public class DropConstant {
    public void printNumbers(int n, int m) {

        for (int a = 1; a <= n; a++) {        // ---------> O(N)
            System.out.println(a);
        }
        System.out.println("2nd Loop : ");   // ----------> O(1)

        for (int b = 1; b <= m; b++) {        // ---------> O(N)
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        DropConstant dc = new DropConstant();
        dc.printNumbers(5, 5);
    }
}
