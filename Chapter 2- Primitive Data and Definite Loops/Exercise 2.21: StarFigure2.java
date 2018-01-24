/*Modify your StarFigure code from the previous problem to use a constant for the size. The outputs below use a constant size of 3 (left) and 6 (right):

     size 3	
////////\\\\\\\\
////********\\\\
****************

                 size 6
////////////////////\\\\\\\\\\\\\\\\\\\\
////////////////********\\\\\\\\\\\\\\\\
////////////****************\\\\\\\\\\\\
////////************************\\\\\\\\
////********************************\\\\
****************************************

(You must solve this problem using only ONE public static final constant, not multiple constants; and its value must be used
in the way described in this problem.)*/

public class StarFigure2 {
    public static final int R = 7;
    
	public static void main(String[] args) {
		for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= (4*R) - 4 * i; j++) {
                System.out.print("/");
            
		}
		for (int j = 1; j <= 8 * i - 8; j++) {
            System.out.print("*");
		}
		for (int j = 1; j <= (4*R) - 4 * i; j++) {
            System.out.print("\\");
	}
		System.out.println();
	}
}
}
