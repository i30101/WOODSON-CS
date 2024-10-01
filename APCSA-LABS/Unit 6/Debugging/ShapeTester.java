import java.awt.*; 
import javax.swing.*;

public class ShapeTester extends JPanel {
    private Shape shapes[][]=new Shape[3][3];
    
    public ShapeTester() {
        int x=50;
        int y=50;
        
        for (int r=0; r<shapes.length; r++) {
            for (int c=0; c<shapes[0].length; c++) {
                int num=(int)(Math.random()*4+1);
                
                if (num==1) {
                    shapes[r][c]= new Circle ((int)(Math.random()*(31)+20), x, y);
                } else if (num==2){ 
                    shapes[r][c]= new Rectangle (x, y, (int)(Math.random()*(61)+40), (int)(Math.random()*(61)+40));
                }else if (num==3) {
                    int s=(int)(Math.random()*(61)+40);
                    shapes[r][c]= new Square (x, y, s, s);
                }else {
                    shapes[r][c]= new RightTriangle (x, y, (int)(Math.random()*(61)+40), (int)(Math.random()*(61)+40));
                }
                x=x+200;
            }
            y=y+200;
            x=50;
        }
    }
    
    public void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());
        for (Shape[] row : shapes){
            for (Shape shape : row){        	
                shape.prepInfo(g);
                shape.paintShape(g);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes Aplenty!");
        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setContentPane(new ShapeTester());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100, 100);
        frame.setVisible(true);
    }
}