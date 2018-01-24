/*Modify your code from the previous problem to produce the following output:


999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221

*/

for(int i = 1; i <= 4; i++) {
    for(int j = 9; j >= 1; j--) {
        for(int k = j - 1; k >= 0; k--)
            System.out.print(j);
    }
    System.out.println();
}
