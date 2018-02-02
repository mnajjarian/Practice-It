/*What is wrong with the following code, which attempts to count the number occurrences of the letter 'e' in a string, case-insensitively?
Determine what is wrong with the code, and submit a corrected version that works properly. Use at least one method call from the Character 
class in your solution.*/

int count = 0;
for (int i = 0; i < s.length(); i++) {
    if (Character.toLowerCase(s.charAt(i)) == 'e') {
        count++;
    }
}
