/*Write a method named lastDigit that returns the last digit of an integer. For example, lastDigit(3572) should return 2. 
It should work for negative numbers as well. For example, lastDigit(-947) should return 7.

      Call	          Value Returned
lastDigit(3572)	            2
lastDigit(-947)	            7
lastDigit(6)	              6
lastDigit(35)	              5
lastDigit(123456)          	6

(Hint: This is a short method. You may not use a String to solve this problem.*/

public static int lastDigit(int number) {
    return Math.abs(number % 10);
}
