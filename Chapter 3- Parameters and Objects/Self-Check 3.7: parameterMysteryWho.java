/*Given the following program:


public class MysteryWho {
    public static void main(String[] args) {
        String whom = "her";
        String who = "him";
        String it = "who";
        String he = "it";
        String she = "whom";
​
        sentence(he, she, it);
        sentence(she, he, who);
        sentence(who, she, who);
        sentence(it, "stu", "boo");
        sentence(it, whom, who);
    }
​
    public static void sentence(String she, String who, String whom) {
        System.out.println(who + " and " + whom + " like " + she);
    }
}*/
Write the output of each of the following calls.

 sentence(he, she, it);  	    whom and who like it
 sentence(she, he, who);	    it and him like whom
 sentence(who, she, who);   	whom and him like him
 sentence(it, "stu", "boo");	stu and boo like who
 sentence(it, whom, who);	    her and him like who
