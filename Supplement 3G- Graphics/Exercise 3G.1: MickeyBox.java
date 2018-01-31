/*Write a complete program in a class named MickeyBox that uses the DrawingPanel to draw the following figure:

The window is 220 pixels wide and 150 pixels tall. The background is yellow. There are two blue ovals of size 40 x 40 pixels.
The left oval's top-left corner is located at position (50, 25), and the two ovals' top-left corners are 80 pixels apart horizontally.
There is a red square whose top two corners exactly intersect the centers of the two ovals. Lastly, there is a black horizontal line 
through the center of the square.

(You don't need to include any import statements at the top of your program.) (The next exercise is a modified version of this 
program, so you can use the code you write here as a starting point for that exercise.)*/

public class MickeyBox {

	public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(220, 150);
        panel.setBackground(new Color(255, 255, 0));
        Graphics g = panel.getGraphics();
	
		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		g.fillOval(130, 25, 40, 40);
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 150, 85);
    }

}
