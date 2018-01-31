/*Finish the given program called Stairs that uses the DrawingPanel to draw the figure shown below. The window is 110 x 110 px in 
size. The first stair's top-left corner is at position (5, 5). The first stair is 10 x 10 pixels in size. Each stair is 10 pixels 
wider than the one above it. (If you're having trouble matching the output, make a table with the (x, y) coordinates and 
(width x height) sizes of the first five stairs. Note which values change and which ones stay the same.)

(You don't need to include any import statements at the top of your program.) (The next exercise is a modified version of this 
program, so you can use the code you write here as a starting point for that exercise.)*/

public class Stairs {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(110, 110);
        Graphics g = panel.getGraphics();
        for (int i = 1; i <= 10; i++) {
            g.drawRect(5, 10 * i - 5, 10 * i, 10);
        }
    }
}
