/*Using the DrawingPanel class, write a Java class named Football that produces the following figure:
Though the figure looks to contain curves, it is made entirely of straight lines. The window is 250 x 250 pixels in size, 
and there is an outer rectangle from (10, 30) to (210, 230). A set of black lines are drawn around the edges every 10 pixels. 
For example, along the top-left, there is a line from (10, 220) to (20, 30), a line from (10, 210) to (30, 30), a line from 
(10, 200) to (40, 30), ... and so on. 
Along the bottom-right, there is a line from (20, 230) to (210, 220), a line from (30, 230) to (210, 210), and so on.*/

public class Football {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(250, 250);
        Graphics g = panel.getGraphics();
        g.setColor(Color.black);
		    g.drawRect(10, 30, 200, 200);
		    for(int i = 0; i < 20; i++) {
            int x1 = 10;
		       	int y1 = 220 - 10 * i;
			      int x2 = 20 + 10 * i;
			      int y2 = 30;
		        g.drawLine(x1, y1, x2, y2);
		        g.drawLine(x2, 230, 210, y1);
        }
    }
}
