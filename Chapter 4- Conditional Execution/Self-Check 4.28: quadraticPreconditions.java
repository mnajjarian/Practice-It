/*Exercise 3.8 asked you to write a method called quadratic that solves quadratic equations and prints their roots.
Recall that a quadratic equation is a polynomial equation in terms of a variable x of the form a x2 + b x + c = 0. 
But for some values of a, b, and c, the formula does not find any valid roots. Under what conditions would this formula fail? 
Modify the quadratic method so that it will reject invalid values of a, b, or c by throwing an IllegalArgumentException. 
(You may want to go back and complete the exercise in the previous chapter first.)*/

	public static void quadratic(int a, int b, int c) {
        double determinant = b * b - 4 * a * c;
    if (a == 0) {
        throw new IllegalArgumentException( "Invalid a value of 0");
    }
    if (determinant < 0) {
        throw new IllegalArgumentException( "Invalid determinant");
    }
	    double r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	    double r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	    
	    System.out.println("First root = " + r1);
	    System.out.println("Second root = " + r2);
	}
