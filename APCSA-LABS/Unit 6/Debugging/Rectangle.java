import java.awt.*;

public class Rectangle extends Shape
{
   private int base;
   private int height;
   
  public Rectangle (int xC, int yC, int b, int h)
  {
     super(xC, yC);
     base=b;
     height=h;
  }
  
  @Override
	public void paintShape(Graphics g) {
	  g.setColor(randomColor());
	  g.fillRect(getX(), getY(), base, height);
	}
   
   @Override
   public void prepInfo(Graphics g)
   {
      int area=base*height;
      showShapeInfo(g, area);
   }

}
