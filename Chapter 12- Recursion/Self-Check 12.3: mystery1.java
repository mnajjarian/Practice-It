/*For each call to the following method, indicate what console output is produced:

public void mystery1(int n) {
    if (n <= 1) {
        System.out.print(n);
    } else {
        mystery1(n / 2);
        System.out.print(", " + n);
    }
}*/

 mystery1(1);	          1
 mystery1(4);	          1, 2, 4
 mystery1(16);	        1, 2, 4, 8, 16
 mystery1(30);	        1, 3, 7, 15, 30
 mystery1(100);        	1, 3, 6, 12, 25, 50, 100
