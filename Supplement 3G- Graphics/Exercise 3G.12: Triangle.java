/*Using the DrawingPanel class, write a Java class named Triangle that produces the following figure:

-size: 600x200
-background color: yellow
-line color: blue
-vertical spacing between lines: 10 px
The diagonal lines connect at the bottom in the middle.*/

public class Triangle {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(600, 200);
        panel.setBackground(Color.YELLOW);
        Graphics g = panel.getGraphics();
        g.setColor(Color.BLUE);
        g.drawLine(0, 0, 300, 200);
		    g.drawLine(300, 200, 600, 0);
        for(int i = 1; i < 20; i++) {
            g.drawLine(15 * i, 10 * i, 600 - 15 * i, 10 * i);
        }
    }
}
