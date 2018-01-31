/*Modify your ShowDesign class from the previous exercise into a new class ShowDesign2 that has a method named showDesign that 
accepts parameters for the window width and height and displays the rectangles at the appropriate sizes. For example, if your 
showDesign method was called with values of 300 and 100, the window would look like the following figure.
 
(You don't need to include any import statements at the top of your program.)*/

public class ShowDesign2 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(300, 100);
        Graphics g = panel.getGraphics();
        showDesign(g, 300, 100);
    }
        public static void showDesign(Graphics g, int x, int y) {
            g.setColor(Color.WHITE);
		    g.fillRect(0, 0, x, y);
			g.setColor(Color.BLACK);
				    for(int i = 1; i < 5; i++) {
				    	int rectWidth = x - (x / 5) * i;
				    int rectHeight = y - (y / 5) * i;
				    int rectX = x / 10 * i;
				    int rectY = y / 10 * i;
				    g.drawRect(rectX, rectY, rectWidth, rectHeight);
        }
    }
}
