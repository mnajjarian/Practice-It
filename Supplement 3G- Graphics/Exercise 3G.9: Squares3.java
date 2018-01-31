/*Modify your Squares2 program from the previous exercise into a new class Squares3 that draws the following figures. 
(Go back to that problem and copy/paste your code here as a starting point.) Parameterize your program so that the figures have
the sizes shown below. The top-right figure has size 50, and the bottom-right figure has size 180.*/

public class Squares3 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel();
        panel.setBackground(Color.CYAN);
        panel.setSize(400, 300);
        Graphics g = panel.getGraphics();
        drawingFigure(g, 50, 50, 100);
		    drawingFigure(g, 250, 10, 50);
		    drawingFigure(g, 180, 115, 180);
    }
        public static void drawingFigure(Graphics g, int x, int y, int j) {
            g.setColor(Color.RED);
				for(int i = 0; i < 6; i++) {
					g.drawRect(x, y, i * (j / 5), i * (j / 5));
				}
				g.setColor(Color.BLACK);
				g.drawLine(x, y, x + j, y + j);
    }
}
