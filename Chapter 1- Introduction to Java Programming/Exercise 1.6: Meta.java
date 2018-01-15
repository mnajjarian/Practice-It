/*Write a complete Java program called Meta whose output is the text that would be the source code of a Java program named 
Hello that prints "Hello, world!" as its output:


public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}

Your program must produce exactly the output shown in order to pass (using exactly four spaces for each increment of 
indentation in the output).*/

public class Meta {
    public static void main(String[] args) {
        System.out.println("public class Hello {");
        System.out.println("    public static void main(String[] args) {");
        System.out.println("        System.out.println(\"Hello, world!\");");
        System.out.println("    }");
        System.out.println("}");
    }
