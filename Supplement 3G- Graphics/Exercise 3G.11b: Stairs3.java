/*Modify your Stairs program from the previous exercise to make a new class Stairs3 that draws the output shown below. Modify only 
the body of your loop. (You may want to make a new table to find the expressions for x, y, width, and height for each new output.)

(You don't need to include any import statements at the top of your program.) (The next exercise is a modified version of this 
program, so you can use the code you write here as a starting point for that exercise.)*/

public class Stairs3 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(110, 110);
        Graphics g = panel.getGraphics();
        for (int i = 1; i <= 10; i++) {
            g.drawRect(105 - i * 10 , i * 10 - 5,10 * i, 10);
        }
    }
}
