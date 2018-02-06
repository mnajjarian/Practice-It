/*What elements does the array numbers contain after the following code is executed? (Write the elements in the format: 
{0, 1, 2, ...} )


int[] numbers = new int[8];
numbers[1] = 4;
numbers[4] = 99;
numbers[7] = 2;
​
int x = numbers[1];
numbers[x] = 44;
numbers[numbers[7]] = 11;   // uses numbers[7] as index*/

{0, 4, 11, 0, 44, 0, 0, 2}
