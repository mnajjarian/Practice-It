/*Write code that uses a for loop to print each element of an array named data that contains five integers. If the array contains 
the elements [14, 5, 27, -3, 2598], then your code should produce the following output:

element [0] is 14
element [1] is 5
element [2] is 27
element [3] is -3
element [4] is 2598

Once your code works for the array of size 5, generalize the code so that it works for an array of any length.*/
for(int i = 0; i < data.length; i++) {
    System.out.println("element [" + i + "] is " + data[i]);
}
