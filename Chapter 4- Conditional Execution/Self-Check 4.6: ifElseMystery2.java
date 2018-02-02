/*Consider the following method.


public static void ifElseMystery2(int a, int b) {
    if (a * 2 < b) {
        a = a * 3;
    }
    if (b < a) {
        b++;
    } else {
        a--;
    }
    System.out.println(a + " " + b);
}
For each call below, indicate what output is produced.*/

 ifElseMystery2(10, 2);	10 3
 ifElseMystery2(3, 8);	9 9
 ifElseMystery2(4, 4);	3 4
 ifElseMystery2(10, 30);	29 30
