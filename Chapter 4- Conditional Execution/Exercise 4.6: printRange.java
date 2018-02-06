/*Write a method called printRange that accepts two integers as arguments and prints the sequence of numbers between the two arguments,
separated by spaces. Print an increasing sequence if the first argument is smaller than the second; otherwise, print a decreasing 
sequence. If the two numbers are the same, that number should be printed by itself. Here are some sample calls to printRange:


printRange(2, 7);
printRange(19, 11);
printRange(5, 5);
The output produced should be the following:

2 3 4 5 6 7 
19 18 17 16 15 14 13 12 11 
5 
*/
	public static void printRange(int s, int f) {
		if(s > f) {
		for(int i = s; i >= f; i--) {
			System.out.print(i + " ");
		}
		} else if( s < f) {
			for(int i = s; i <= f; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println(s);
		}
        System.out.println();
	}
