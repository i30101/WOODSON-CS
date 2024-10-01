public class CirclePractice extends ShapePractice
{
   private double radius;

   public CirclePractice(double r) {
      super("CirclePractice");
      radius=r;
   }
   public double getArea()
   {
     return Math.PI*Math.pow(radius, 2);
   }
}