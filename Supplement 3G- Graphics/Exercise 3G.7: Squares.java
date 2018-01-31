/*Write a program in a class named Squares that uses the DrawingPanel to draw the following figure:

The drawing panel is 300 pixels wide by 200 pixels high. Its background is cyan. The horizontal and vertical lines are drawn in
red and the diagonal line is drawn in black. The upper-left corner of the diagonal line is at (50,50). Successive horizontal 
and vertical lines are spaced 20 pixels apart. The diagonal line is drawn on top of the horizontal and vertical lines.

(You don't need to include any import statements at the top of your program.) (The next two exercises are modified versions of 
this program, so you can use the code you write here as a starting point for those exercises.)*/

public class Squares {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel();
        panel.setBackground(Color.CYAN);
        panel.setSize(300, 200);
        Graphics g = panel.getGraphics();
        g.setColor(Color.RED);
		    g.drawRect(50, 50, 20, 20);
		    g.drawRect(50, 50, 40, 40);
		    g.drawRect(50, 50, 60, 60);
		    g.drawRect(50, 50, 80, 80);
		    g.drawRect(50, 50, 100, 100);
		    g.setColor(Color.BLACK);
		    g.drawLine(50, 50, 150, 150);
    }
}
