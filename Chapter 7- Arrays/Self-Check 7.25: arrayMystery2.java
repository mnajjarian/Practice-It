/*Consider the following method, mystery.


public static void mystery2(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
        a[i] = a[2 * i % a.length] - b[3 * i % b.length];
    }
}
What are the values of the elements in array a1 after the following code executes?


int[] a1 = {2, 4, 6, 8, 10, 12, 14, 16};
int[] a2 = {1, 1, 2, 3, 5, 8, 13, 21};
mystery2(a1, a2);
*/
 a1[0]	1
 a1[1]	3
 a1[2]	-3
 a1[3]	13
 a1[4]	-4
 a1[5]	-24
 a1[6]	-6
 a1[7]	-14
