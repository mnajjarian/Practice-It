/*For each call to the following method, indicate what console output is produced:

public void mystery2(int n) {
    if (n > 100) {
        System.out.print(n);
    } else {
        mystery2(2 * n);
        System.out.print(", " + n);
    }
}*/

 mystery2(113);	113
 mystery2(70);	140, 70
 mystery2(42);	168, 84, 42
 mystery2(30);	120, 60, 30
 mystery2(10);	160, 80, 40, 20, 10
