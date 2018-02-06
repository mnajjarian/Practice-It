/*Write a method named smallestLargest that asks the user to enter numbers, then prints the smallest and largest of all the numbers 
typed in by the user. You may assume the user enters a valid number greater than 0 for the number of numbers to read. Here is an 
example dialogue:

How many numbers do you want to enter? 4
Number 1: 5
Number 2: 11
Number 3: -2
Number 4: 3
Smallest = -2
Largest = 11
*/
   public static void smallestLargest() {
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers do you want to enter? ");
		int numbers = console.nextInt();
		int smalest = Integer.MAX_VALUE;
	    int largest = Integer.MIN_VALUE;
		
		for(int i = 1; i <= numbers; i++) {
			System.out.print("Number " + i + ": ");
			int num = console.nextInt();
			if(num < smalest) { 
				smalest = num;
			}
			if(num > largest) {
			largest = num;
			}
		}
				System.out.println("Smallest = " + smalest);
				System.out.println("Largest = " + largest);
}
