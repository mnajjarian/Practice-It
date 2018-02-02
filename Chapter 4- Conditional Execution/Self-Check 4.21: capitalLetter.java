/*Write an if statement that tests to see whether a String stored in a variable named phrase begins with a capital letter. If the 
string begins with a capital letter, print capital . If not, print not capital . Use at least one method call from the Character 
class in your solution. You may assume that the string is non-empty (contains at least one character).*/

if(Character.isUpperCase(phrase.charAt(0))) {
    System.out.println("capital");
} else {
    System.out.println("not capital");
}
