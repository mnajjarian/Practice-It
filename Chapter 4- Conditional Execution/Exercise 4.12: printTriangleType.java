/*Write a method called printTriangleType that accepts three integer arguments representing the lengths of the sides of a triangle 
and prints what type of triangle it is. The three types are equilateral, isosceles, and scalene. An equilateral triangle has 
all three sides the same length, an isosceles triangle has two sides the same length, and a scalene triangle has three sides 
of different lengths. Here are some example calls to printTriangleType:

printTriangleType(5, 7, 7);
printTriangleType(6, 6, 6);
printTriangleType(5, 7, 8);
printTriangleType(12, 18, 12);
The output produced should be the following:

isosceles
equilateral
scalene
isosceles
*/
public static void printTriangleType(int a, int b, int c) {
		if(a != b && b == c || a != c && a == b || c != b && a == c) {
			System.out.println("isosceles");
		} else if(a == b && b == c && c == a) {
			System.out.println("equilateral");
		} else {
			System.out.println("scalene");
		}
	}
