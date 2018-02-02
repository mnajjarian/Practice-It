/*Write a piece of code that reads a shorthand text description of a playing card and prints the longhand equivalent. The shorthand
description is the card's rank (2 through 10, J, Q, K, or A) followed by its suit (C, D, H, or S). You should expand the shorthand 
into the form "Rank of Suit". You may assume that the user types valid input.

Here are two sample executions:

Enter a card: 9 S
Nine of Spades
Enter a card: K C
King of Clubs

(Because there are so many rank/suit combinations, you will need several if/else branches. But if you have 52 branches, one for 
each unique card, that is too many!)*/

		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter a card: ");
		String rank = console.next();
		String suit = console.next();
		
		if(rank.equals("2")) {
			rank = "Two";
		} else if(rank.equals("3")) {
			rank = "Three";
		} else if(rank.equals("4")) {
			rank = "Forth";
		} else if(rank.equals("5")) {
			rank = "Fifth";
		} else if(rank.equals("6")) {
			rank = "Six";
		} else if(rank.equals("7")) {
			rank = "seven";
		} else if(rank.equals("8")) {
			rank = "Eight";
		} else if(rank.equals("9")) {
			rank = "Nine";
		} else if(rank.equals("10")) {
			rank = "Ten";
		} else if(rank.equalsIgnoreCase("K")) {
			rank = "King";
		} else if(rank.equalsIgnoreCase("A")) {
			rank = "Ace";
		} else if(rank.equalsIgnoreCase("Q")) {
			rank = "Queen";
		} else if(rank.equalsIgnoreCase("J")) {
			rank = "Jack";
		} 
			if(suit.equalsIgnoreCase("C")) {
				suit = "Clubs";
			} else if(suit.equalsIgnoreCase("D")) {
				suit = "Diamonds";
			} else if(suit.equalsIgnoreCase("H")) {
				suit = "Hearts";
			} else if(suit.equalsIgnoreCase("S")) {
				suit = "Spades";
			}
		
		System.out.println(rank + " of " + suit);
