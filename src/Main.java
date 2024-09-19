import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.GridLayout;

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
    Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Frame.setLayout(new GridLayout(3, 3));
    JButton b1 = new JButton("");
    JButton b2 = new JButton("");
    JButton b3 = new JButton("");
    JButton b4 = new JButton("");
    JButton b5 = new JButton("");
    JButton b6 = new JButton("");
    JButton b7 = new JButton("");
    JButton b8 = new JButton("");
    JButton b9 = new JButton("");

    Frame.add(b1);
    Frame.add(b2);
    Frame.add(b3);
    Frame.add(b4);
    Frame.add(b5);
    Frame.add(b6);
    Frame.add(b7);
    Frame.add(b8);
    Frame.add(b9);
  }
}
