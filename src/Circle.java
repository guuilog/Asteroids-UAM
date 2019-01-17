import java.awt.Graphics;

public class Circle {
	
	public Point position;
	public int radius;
	
	public Circle(Point pos, int r){
		position = pos;
		radius = r;
		
	}
	
	
	
	public void paint(Graphics g2d){
		
		g2d.fillOval((int)position.x, (int)position.y, radius, radius);
	}
}
