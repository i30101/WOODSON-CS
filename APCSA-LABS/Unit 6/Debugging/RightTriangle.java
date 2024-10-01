import java.awt.*;

public class RightTriangle extends Shape
{
   private int base;
   private int height;
   
   public RightTriangle(int xC, int yC, int b, int h)
   {
      super (xC, yC);
      base=b;
      height=h;
   }
   @Override
	public void paintShape(Graphics g) {
	  g.setColor(randomColor());
	  g.fillPolygon(new int[]{getX(), getX() + base, getX()}, 
	         new int[]{getY(), getY(), getY() + height}, 3);
	}
   @Override
   public void prepInfo(Graphics g)
   {
      int area=(int)0.5*base*height;
      showShapeInfo(g, area);
   }
}