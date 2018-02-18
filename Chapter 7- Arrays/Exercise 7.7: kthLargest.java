/*Write a method called kthLargest that accepts an integer k and an array a as its parameters and returns the element such that
k elements have greater or equal value. If k = 0, return the largest element; if k = 1, return the second largest element, and so on.

For example, if the array passed contains the values {74, 85, 102, 99, 101, 56, 84} and the integer k passed is 2, your method 
should return 99 because there are two values at least as large as 99 (101 and 102).

Assume that 0 <= k < a.length. (Hint: Consider sorting the array, or a copy of the array first.)*/
public static int kthLargest(int k, int[] a) {
		Arrays.sort(a);
		return a[a.length - (k + 1)];
	}
