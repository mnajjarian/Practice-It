/*What output is produced by the following program?


public class MysterySoda {
    public static void main(String[] args) {
        String soda = "coke";
        String pop = "pepsi";
        String coke = "pop";
        String pepsi = "soda";
        String say = pop;
        carbonated(coke, soda, pop);
        carbonated(pop, pepsi, pepsi);
        carbonated("pop", pop, "koolaid");
        carbonated(say, "say", pop);
    }
​
    public static void carbonated(String coke, String soda, String pop) {
        System.out.println("say " + soda + " not " + pop + " or " + coke);
    }
}*/

 carbonated(coke, soda, pop);	        say coke not pepsi or pop
 carbonated(pop, pepsi, pepsi);	      say soda not soda or pepsi
 carbonated("pop", pop, "koolaid");	  say pepsi not koolaid or pop
 carbonated(say, "say", pop);	        say say not pepsi or pepsi
