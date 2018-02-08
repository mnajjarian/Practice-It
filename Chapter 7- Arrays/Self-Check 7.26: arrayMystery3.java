/*Consider the following method, mystery.


public static void mystery3(int[] data, int x, int y) {
    data[data[x]] = data[y];
    data[y] = x;
}
What are the values of the elements in array numbers after the following code executes?

int[] numbers = {3, 7, 1, 0, 25, 4, 18, -1, 5};
mystery3(numbers, 3, 1);
mystery3(numbers, 5, 6);
mystery3(numbers, 8, 4);
*/
 numbers[0]	7
 numbers[1]	3
 numbers[2]	1
 numbers[3]	0
 numbers[4]	8
 numbers[5]	18
 numbers[6]	5
 numbers[7]	-1
 numbers[8]	5
