/*What is the output produced from the following program? You may wish to draw a structure diagram first. This is 
a slightly modified version of the previous problem, Strange.

public class Strange {
    public static void main(String[] args) {
        first();
        third();
        second();
        third();
    }
    
    public static void first() {
        System.out.println("Inside first method.");
    }
    
    public static void second() {
        System.out.println("Inside second method.");
        first();
    }
    
    public static void third() {
        first();
        second();
        System.out.println("Inside third method.");
    }
}*/
Inside first method.
Inside first method.
Inside second method.
Inside first method.
Inside third method.
Inside second method.
Inside first method.
Inside first method.
Inside second method.
Inside first method.
Inside third method.
