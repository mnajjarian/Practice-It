/*Assume that a two-dimensional rectangular array of integers called matrix has been declared with six rows and eight columns.
Write a for loop to copy the contents of the second column into the fifth column.*/
for(int i = 0; i < 6; i++) {
    matrix[i][4] = matrix[i][1];
}
