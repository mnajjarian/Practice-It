/*Write a static method named isSorted that accepts an array of doubles as a parameter and returns true if the list is in sorted 
(nondecreasing) order and false otherwise. For example, if arrays named list1 and list2 store {16.1, 12.3, 22.2, 14.4} and 
{1.5, 4.3, 7.0, 19.5, 25.1, 46.2} respectively, the calls isSorted(list1) and isSorted(list2) should return false and true 
respectively. Assume the array has at least one element. A one-element array is considered to be sorted.*/
public static boolean isSorted(double[] array) {
		for(int i = 1; i < array.length; i++) {
			if(array[i] < array[i - 1]) {
				return false;
			}
		}
		return true;
	}
