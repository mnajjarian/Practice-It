/*The following code attempts to draw a black rectangle from (10, 20) to (50, 40) with a line across its diagonal:


DrawingPanel panel = new DrawingPanel(200, 100);
Graphics g = panel.getGraphics();
g.drawRect(10, 20, 50, 40);
g.drawLine(10, 20, 50, 40);
However, it is incorrect. Find the mistakes and correct the code. Type the correct code below.*/

DrawingPanel panel = new DrawingPanel(200, 100);
Graphics g = panel.getGraphics();
g.drawRect(10, 20, 40, 20);
g.drawLine(10, 20, 50, 40);
