import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

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

    JButton[] buttons = { b1, b2, b3, b4, b5, b6, b7, b8, b9 };

    Frame.add(b1);
    Frame.add(b2);
    Frame.add(b3);
    Frame.add(b4);
    Frame.add(b5);
    Frame.add(b6);
    Frame.add(b7);
    Frame.add(b8);
    Frame.add(b9);

    ActionListener buttonListener = new ActionListener() {
      int counter = 0;

      public void actionPerformed(ActionEvent ae) {
        JButton button = (JButton) ae.getSource();
        if (counter == 0) {
          button.setText("X");
        }
        if (counter == 1) {
          button.setText("O");
        }
        if (counter == 2) {
          button.setText("X");
        }
        if (counter == 3) {
          button.setText("O");
        }
        if (counter == 4) {
          button.setText("X");
        }
        if (counter == 5) {
          button.setText("O");
        }
        if (counter == 6) {
          button.setText("X");
        }
        if (counter == 7) {
          button.setText("O");
        }
        if (counter == 8) {
          button.setText("X");
        }
        counter++;
      }
    };
    for (JButton button : buttons) {
      button.setFont(new Font("Arial", Font.BOLD, 25));
    }
    for (JButton button : buttons) {
      button.addActionListener(buttonListener);
    }

    if (b1.getText().equals(b2.getText())) {
      System.out.println("boy");

    }
  }
}
