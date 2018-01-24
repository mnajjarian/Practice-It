/*Write a Java program in a class named Window that produces the preceding figure as output. Use nested for loops to print the repeated parts of the figure. 
Once you get it to work, add one class constant to your program so that the size of the figure can be changed simply by 
changing that constant's value. The example output shown is at a constant size of 3, but if you change the constant, the figure
should grow larger and wider proportionally.

+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
|   |   |
|   |   |
|   |   |
+===+===+

(You must solve this problem using only ONE public static final constant, not multiple constants; and its value must be used
in the way described in this problem.)*/
public class Window {
public static final int R = 7;
    
	public static void main(String[] args) {
        
		System.out.print("+");
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= R; j++)
				System.out.print("=");
			System.out.print("+");
		}
			System.out.println();
				for(int k = 1; k <= R; k++) { 
				   for(int i = 1; i <= 3; i++) {
					   System.out.print("|");
					   for(int j = 1; j <= R; j++)
					   System.out.print(" ");
				   }
				System.out.println();
		}
				System.out.print("+");
				for(int i = 1; i <= 2; i++) {
					for(int j = 1; j <= R; j++)
						System.out.print("=");
					System.out.print("+");
				}
				window();
	}
	public static void window() {
			System.out.println();
				for(int k = 1; k <= R; k++) { 
				   for(int i = 1; i <= 3; i++) {
					   System.out.print("|");
					   for(int j = 1; j <= R; j++)
					   System.out.print(" ");
				   }
				System.out.println();
		}
				System.out.print("+");
				for(int i = 1; i <= 2; i++) {
					for(int j = 1; j <= R; j++)
						System.out.print("=");
					System.out.print("+");
	}
	}
}
