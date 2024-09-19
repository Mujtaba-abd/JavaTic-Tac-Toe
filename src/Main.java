import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Main {
  public static void main(String[] args) {
    JFrame Frame = new JFrame();
    Frame.setSize(800, 600);
    Frame.setVisible(true);
    Frame.setTitle("XO");
    Frame.setResizable(false);

    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    int w = Frame.getSize().width;
    int h = Frame.getSize().height;

    int x = (dim.width - w) / 2;
    int y = (dim.height - h) / 2;

    Frame.setLocation(x, y);
  }
}
