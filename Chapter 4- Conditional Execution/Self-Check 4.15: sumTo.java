/*What is wrong with the following sumTo method, which attempts to add all numbers from 1 to a given maximum? Correct the code so 
that it properly implements this behavior. For example the call of sumTo(5) should return 1+2+3+4+5 = 15. You may assume that the 
value passed is at least 1.*/

public static int sumTo(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    return sum;
}
