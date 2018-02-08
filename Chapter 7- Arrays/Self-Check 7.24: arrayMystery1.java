/*Consider the following method, mystery.


public static void mystery(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
        a[i] += b[b.length - 1 - i];
    }
}
What are the values of the elements in array a1 after the following code executes?


int[] a1 = {1, 3, 5, 7, 9};
int[] a2 = {1, 4, 9, 16, 25};
mystery(a1, a2);
*/
 a1[0]	26
 a1[1]	19
 a1[2]	14
 a1[3]	11
 a1[4]	10
