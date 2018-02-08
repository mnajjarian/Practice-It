/*Consider the following method:


public static int arrayMystery4(int[] list) {
    int x = 0;
    for (int i = 1; i < list.length; i++) {
        int y = list[i] - list[0];
        if (y > x) {
            x = y;
        }
    }
    return x;
}
For each array below, indicate what value would be returned if the method mystery were called and passed that array as its parameter.*/


 {5}                    0
 {3, 12}	            9
 {4, 2, 10, 8}	        6
 {1, 9, 3, 5, 7}      	8
 {8, 2, 10, 4, 10, 9}	2
