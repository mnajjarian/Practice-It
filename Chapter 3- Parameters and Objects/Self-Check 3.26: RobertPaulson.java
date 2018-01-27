/*Write code that prompts the user for a phrase and a number of times to repeat it, then prints the phrase the phrase that many times. Here is an example dialogue with the user:

What is your phrase? His name is Robert Paulson
How many times should I repeat it? 3
His name is Robert Paulson
His name is Robert Paulson
His name is Robert Paulson
*/
Scanner reader = new Scanner(System.in);
System.out.print("What is your phrase? ");
String phrase = reader.nextLine();
System.out.print("How many times should I repeat it? ");
int repeat = reader.nextInt();
for(int i = 0; i < repeat; i++) {
    System.out.println(phrase);
}
