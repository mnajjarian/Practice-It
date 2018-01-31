/*There are three mistakes in the following code, which attempts to draw a line from coordinates (50, 86) to (20, 35):


DrawingPanel panel = new DrawingPanel(200, 200);
panel.drawLine(50, 20, 86, 35);
Find the mistakes and correct the code. Type the correct code below.*/

DrawingPanel panel = new DrawingPanel(200, 200);
Graphics g = panel.getGraphics();
g.drawLine(50, 86, 20, 35);
