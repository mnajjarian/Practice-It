/*Consider the following method:


public static void mystery2d(int[][] a) {
    for (int r = 0; r < a.length; r++) {
        for (int c = 0; c < a[0].length - 1; c++) {
            if (a[r][c + 1] > a[r][c]) {
                a[r][c] = a[r][c + 1];
            }
        }
    }
}
If a two-dimensional array named numbers is initialized to store the following integers, what are its contents after the call shown?


int[][] numbers = {
    {3, 4, 5, 6},
    {4, 5, 6, 7},
    {5, 6, 7, 8}
};
mystery2d(numbers);
*/

 numbers[0][0]	4
 numbers[0][1]	5
 numbers[0][2]	6
 numbers[0][3]	6
 numbers[1][0]	5
 numbers[1][1]	6
 numbers[1][2]	7
 numbers[1][3]	7
 numbers[2][0]	6
 numbers[2][1]	7
 numbers[2][2]	8
 numbers[2][3]	8
