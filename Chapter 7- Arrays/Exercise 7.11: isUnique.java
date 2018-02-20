/*Write a method named isUnique that takes an array of integers as a parameter and that returns a boolean value indicating whether or not the values in the array are unique (true for yes, false for no). The values in the list are considered unique if there is no pair of values that are equal. For example, if a variable called list stores the following values:


int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
Then the call of isUnique(list) should return true because there are no duplicated values in this list. If instead the list stored these values:


int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
Then the call should return false because the value 3 appears twice in this list. Notice that given this definition, a list of 0 or 1 elements would be considered unique.*/

public static boolean isUnique(int[] array) {
    for (int i = 0; i < array.length; i++) {
        int min = array[i];
        
        for (int j = i + 1; j < array.length; j++) {
            if (min > array[j]) {
                array[i] = array[j];
                array[j] = min;
                min = array[i];
            }
        }
        
    }
    
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i] == array[i + 1]) {
            return false;
        }
    }
    
    return true;
}
