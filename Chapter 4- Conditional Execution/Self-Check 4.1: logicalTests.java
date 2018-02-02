/*Translate each of the following English statements into logical tests that could be used in an if/else statement. Write the 
appropriate logical test for each statement below. Assume that three int variables, x, y, and z, have already been declared.

(Note: This problem is currently not very well implemented in Practice-It. Right now our system is just checking whether your 
answer exactly matches our expected answer, but some other correct answers might be marked as incorrect even though they would 
work. We plan to improve the system in the future. Sorry for the inconvenience.)*/

a. z is odd.	                               z % 2 != 0;
b. z is not greater than y's square root.	   z <= Math.sqrt(y);
c. y is positive.	                           y > 0;
d. Either x or y is even, and the other is odd. (Hint: Don't use && or ||.)	          x % 2 != y % 2;
e. y is a multiple of z.	                   y % z == 0;
f. z is not zero.	                           z != 0;
g. y is greater in magnitude than z.	       Math.abs(y) > Math.abs(z)
h. x and z are of opposite signs.	           (x >= 0) == (z < 0)
i. y is a nonnegative one-digit number.	     y % 10 == y
j. z is nonnegative.	                       z >= 0;
k. x is even	                               x % 2 == 0;
l. x is closer in value to y than z is.	     Math.abs(x - y) < Math.abs(z - y);
