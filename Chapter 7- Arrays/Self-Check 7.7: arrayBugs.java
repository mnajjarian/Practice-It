/*What is wrong with the following code? Correct the bugs to produce the following expected output:

first  = [3, 7]
second = [3, 7]
They contain the same elements.*/
int[] first = new int[2];
first[0] = 3;
first[1] = 7;
int[] second = new int[2];
second[0] = 3;
second[1] = 7;

// print the array elements
System.out.println("first  = " + Arrays.toString(first));
System.out.println("second = " + Arrays.toString(second));

// see if the elements are the same
if (Arrays.equals(first, second)) {
    System.out.println("They contain the same elements.");
} else {
    System.out.println("The elements are different.");
}
