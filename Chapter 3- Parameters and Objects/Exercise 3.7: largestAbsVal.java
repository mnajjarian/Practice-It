/*Write a method largestAbsVal that accepts three integers as parameters and returns the largest of their three absolute values. 
For example, a call of largestAbsVal(7, -2, -11) would return 11, and a call of largestAbsVal(-4, 5, 2) would return 5.*/

public static int largestAbsVal(int num1, int num2, int num3) {
    return Math.max(Math.abs(num1), Math.max(Math.abs(num2), Math.abs(num3)));
}
