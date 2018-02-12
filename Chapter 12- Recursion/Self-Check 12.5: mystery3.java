/*For each call to the following method, indicate what console output is produced:

public void mystery3(int n) {
    if (n <= 0) {
        System.out.print("*");
    } else if (n % 2 == 0) {
        System.out.print("(");
        mystery3(n - 1);
        System.out.print(")");
    } else {
        System.out.print("[");
        mystery3(n - 1);
        System.out.print("]");
    }
    }*/
 mystery3(0);	*
 mystery3(1);	[*]
 mystery3(2);	([*])
 mystery3(4);	([([*])])
 mystery3(5);	[([([*])])]
