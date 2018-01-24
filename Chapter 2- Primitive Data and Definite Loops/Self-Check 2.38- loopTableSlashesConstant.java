/*Suppose that a program has been written that produces the output shown below (and also shown in the previous Self-Check problem), a pattern of output consisting of lines of repeated characters \, !, and /. Now the author wants the program to be scalable using a class constant called SIZE. The previous output used a size of 6, since there were 6 lines:

!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!//////
\\\\\\\\!!!!!!////////
\\\\\\\\\\!!//////////
The following is the output for a size of 4:

!!!!!!!!!!!!!!
\\!!!!!!!!!!//
\\\\!!!!!!////
\\\\\\!!//////
Fill in the following equations for the number of each character relative to the line number for each type of character. There is a separate equation for size 6 and for size 4. Then once you have figured out both of these equations, find a general equation that uses the SIZE constant and would work for a figure of any size.

Fill in the following equations for the number of occurrences of the ! character on each line. We suggest that you write a table that lists the number of occurrences on each line that you can use to help find the equations from the output, as described in Chapter 2. Make one table for size 6, and another for size 4. (Some values will be the same at both sizes because they do not depend on the size.) Then once you have the equations for both sizes, look at the general pattern that uses the SIZE constant.

Compute the value of A, B, C, D, and E in the equations below. Assume that the lines are numbered from 1 through 6.

SIZE 6 (from the previous Self-Check problem):

number of ! = A * line + B
SIZE 4:

number of ! = A * line + C
General equation for any SIZE:

number of ! = A * line + (D * SIZE + E)
*/

A	-4
B	-2
C	18
D	4
E	2
