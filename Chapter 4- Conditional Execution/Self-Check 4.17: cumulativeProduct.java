/*Write code to produce a cumulative product by multiplying together many numbers that are read from the console. Match the following format:

How many numbers? 4
Next number --> 7
Next number --> 2
Next number --> 3
Next number --> 15
Product = 630
*/
    Scanner console = new Scanner(System.in);		
    System.out.print("How many numbers? ");
		int number = console.nextInt();
		int k = 1;
		for(int i = 1; i <= number; i++) {
			System.out.print("Next number --> ");
			int num = console.nextInt();
			k *= num;
		}
		System.out.println("Product = " + k);
