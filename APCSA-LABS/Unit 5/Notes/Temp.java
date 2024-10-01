public class Temp {
    public static int count(String[][] things) {
       int count = 0;
       for (int r = 0;r < things.length;r++)
       {
              for (int c = 0;c < things[r].length - 1;c++)
              {
                    if (things[r][c].indexOf("a") >= 0)
                   {
                         count++;
                   }
              }
         }
         return count;
    }

    public static void main(String[] args) {
        String[][] words = { {"scarf", "gloves", "hat"}, {"shoes", "shirt", "pants"} };
        System.out.println(count(words));
    }
}
