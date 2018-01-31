/*Modify your Face program from the previous exercise into a new class Face2 to draw the new output shown below. The window size 
should be changed to 520 x 180 pixels, and the faces' top-left corners are at (10, 30), (110, 30), (210, 30), (310, 30), and (410, 30). Draw the figures using a loop to avoid redundancy.
(You don't need to include any import statements at the top of your program.)*/

public class Face2 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(520, 180);
        Graphics g = panel.getGraphics();
        for(int i = 0; i < 5; i++) {
            drawingFace(g, 10 + (i * 100), 30);
        }
    }
        public static void drawingFace(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.drawOval(x, y, 100, 100);   // face outline

        g.setColor(Color.BLUE);
        g.fillOval(x + 20, y + 30, 20, 20);     // eyes
        g.fillOval(x + 60, y + 30, 20, 20);

        g.setColor(Color.RED);          // mouth
        g.drawLine(x + 30, y + 70, x + 70, y + 70);
    }
    }
