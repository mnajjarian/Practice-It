/*For each call to the following method, indicate what console output is produced:

public void mysteryXY(int x, int y) {
    if (y == 1) {
        System.out.print(x);
    } else {
        System.out.print(x * y + ", ");
        mysteryXY(x, y - 1);
        System.out.print(", " + x * y);
    }
}*/

 mysteryXY(4, 1);	4
 mysteryXY(4, 2);	8, 4, 8
 mysteryXY(8, 2);	16, 8, 16
 mysteryXY(4, 3);	12, 8, 4, 8, 12
 mysteryXY(3, 4);	12, 9, 6, 3, 6, 9, 12
