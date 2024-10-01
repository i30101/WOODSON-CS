import javax.swing.JFrame;

public class InfectionGraphicDriver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Infection");
        frame.setSize(1000, 1000);
        frame.setLocation(100, 10);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new RoomPanel());
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
