/*Write a method named evenSum that prompts the user for many integers and print the total even sum and maximum of the even numbers. 
You may assume that the user types at least one non-negative even integer.

how many integers? 4
next integer? 2
next integer? 9
next integer? 18
next integer? 4
even sum = 24
even max = 18
*/
public static void evenSum() {
		Scanner console = new Scanner(System.in);
		System.out.print("how many integers? ");
		int number = console.nextInt();
		int evenSum = 0;
		int evenMax = 0;
		for(int i = 1; i <= number; i++) {
			System.out.print("next integer? ");
			int num = console.nextInt();
			if(num % 2 == 0) {
				evenSum += num;
			}
			if(num % 2 == 0) {
				if(num > evenMax) {
					evenMax = num;
			}
				
			}
		}
			System.out.println("even sum = " + evenSum);
			System.out.println("even max = " + evenMax);
		}
