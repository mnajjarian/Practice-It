/*For each call to the following method, indicate what value is returned:

public static int mystery6(int n, int k) {
    if (k == 0 || k == n) {
        return 1;
    } else if (k > n) {
        return 0;
    } else {
        return mystery6(n - 1, k - 1) + mystery6(n - 1, k);
    }
}*/

 mystery6(7, 1)	7
 mystery6(4, 2)	6
 mystery6(4, 3)	4
 mystery6(5, 3)	10
 mystery6(5, 4)	5
