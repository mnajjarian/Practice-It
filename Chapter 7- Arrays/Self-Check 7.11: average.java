/*Write a method called average that computes the average (arithmetic mean) of all elements in an array of integers and returns
the answer as a double. For example, if the array passed contains the values [1, -2, 4, -4, 9, -6, 16, -8, 25, -10], the calculated 
average should be 2.5. Your method accepts an array of integers as its parameter and returns the average.
You may assume that the array contains at least one element. Your method should not modify the elements of the array.*/

public static double average(int[] data) {
    int sum = 0;
    for(int d : data) {
        sum += d;
    }
    return (double) sum / data.length;
}
