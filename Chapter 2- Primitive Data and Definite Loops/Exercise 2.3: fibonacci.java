/*The Fibonacci numbers are a sequence of integers in which the first two elements are 1, and each following element is the sum 
of the two preceding elements. The mathematical definition of each kth Fibonacci number is the following:

F(k): 
k > 2 : F(k-1) + F(k-2) 
k <= 2 : 1

The first 12 Fibonacci numbers are:

1 1 2 3 5 8 13 21 34 55 89 144
Write a piece of code that uses a for loop to compute and print the first 12 Fibonacci numbers. (You may include other code, 
such as declaring variables before the loop, if you like.)*/

int f0 = 1;
int f1 = 1;

System.out.print(f0 + " ");
System.out.print(f1 + " ");

for(int fk = 2; fk <= 144; fk = f1 + f0) {
System.out.print(fk + " ");
f0 = f1;
f1 = fk;
}
