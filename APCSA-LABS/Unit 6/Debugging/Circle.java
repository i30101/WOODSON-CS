import java.awt.*;

public class Circle extends Shape
{
   private int radius;
   
   public Circle (int r, int xC, int yC)
   {
      super(xC, yC);
      radius=r;
   }
   
   @Override
	public void paintShape(Graphics g) {
	  g.setColor(randomColor());
	  g.fillOval(this.getX(), this.getY(), radius * 2, radius * 2);
	}
   
   @Override
   public void prepInfo(Graphics g)
   {
      int area=(int)Math.PI*radius*radius;
      showShapeInfo(g, area);
   }
}