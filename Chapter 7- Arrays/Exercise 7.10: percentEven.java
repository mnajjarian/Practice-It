/*Write a method called percentEven that accepts an array of integers as a parameter and returns the percentage of even numbers
in the array as a real number. For example, if the array stores the elements {6, 2, 9, 11, 3}, then your method should return 40.0.
If the array contains no even elements or no elements at all, return 0.0.*/
public static double percentEven(int[] array) {
		double num = 0;
    if(array.length < 1) {
			return 0.0;
    }
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				num++;
			}
		}
		return (num * 100) / array.length;
	}
