/*Write a piece of code that constructs a two-dimensional array of integers named table with 5 rows and 10 columns. Fill the array
with a multiplication table, so that array element [i][j] contains the value i * j. Use nested for loops to build the array.*/
int[][] table = new int[5][10];
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 10; j++) {
        table[i][j] = i * j;
    }   
}
