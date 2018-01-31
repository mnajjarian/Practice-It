/*The following code attempts to draw a filled black outer rectangle with a white filled inner circle inside it:


DrawingPanel panel = new DrawingPanel(200, 100);
Graphics g = panel.getGraphics();
g.setColor(Color.WHITE);
g.fillOval(10, 10, 50, 50);
g.setColor(Color.BLACK);
g.fillRect(10, 10, 50, 50);
However, it is incorrect. Find the mistakes and correct the code below.*/

DrawingPanel panel = new DrawingPanel(200, 100);
Graphics g = panel.getGraphics();
g.setColor(Color.BLACK);
g.fillRect(10, 10, 50, 50);
g.setColor(Color.WHITE);
g.fillOval(10, 10, 50, 50);
