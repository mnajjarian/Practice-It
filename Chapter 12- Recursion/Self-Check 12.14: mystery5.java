/*For each call to the following method, indicate what value is returned:

public int mystery5(int x, int y) {
    if (x < 0) {
        return -mystery5(-x, y);
    } else if (y < 0) {
        return -mystery5(x, -y);
    } else if (x == 0 && y == 0) {
        return 0;
    } else {
        return 100 * mystery5(x / 10, y / 10) + 10 * (x % 10) + y % 10;
    }
}*/

 mystery5(5, 7)	       57
 mystery5(12, 9)	     1029
 mystery5(-7, 4)	     -74
 mystery5(-23, -48)    2438
 mystery5(128, 343)	   132483
