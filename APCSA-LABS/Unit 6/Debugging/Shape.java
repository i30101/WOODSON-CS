import java.awt.*;  

public abstract class Shape
{
   private int x;
   private int y;
   
   public Shape(int xC, int yC)
   {
      x=xC;
      y=yC;
   }
   
   public int getX()
   {
      return x;
   }
   
   public int getY()
   {
      return y;
   }
   
   public Color randomColor ()
   {
      int r=(int)(Math.random()*256);
      int g=(int)(Math.random()*256);
      int b=(int)(Math.random()*256);
      return new Color(r,g,b);
   }
   
   public void showShapeInfo(Graphics g, int area) 
   {
	    g.setColor(this.randomColor());
       g.setFont(new Font("Arial", Font.ITALIC, 20));
       g.drawString(this.getClass().getName(), x - 15, y - 25);
	    g.drawString("Area: " + area + " in^2", x - 15, y - 5);
	}
   
   public abstract void paintShape(Graphics g);
  
   
   public abstract void prepInfo(Graphics g);
   
}