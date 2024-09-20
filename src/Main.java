import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
      int counter = 1;

      boolean gameOver = false;

      public void actionPerformed(ActionEvent ae) {
        JButton button = (JButton) ae.getSource();
        if (counter % 2 == 1) {
          button.setText("X");
        } else {
          button.setText("O");
        }
        counter++;

        if (gameOver == false) {
          if (buttons[0].getText().equals(buttons[1].getText())
              && buttons[1].getText().equals(buttons[2].getText()) && !buttons[0].getText().isEmpty()) {
            gameOver = true;
            JOptionPane.showMessageDialog(null, buttons[0].getText() + " Wins Game Over");
          } else if (buttons[3].getText().equals(buttons[4].getText())
              && buttons[4].getText().equals(buttons[5].getText()) && !buttons[3].getText().isEmpty()) {
            gameOver = true;
            JOptionPane.showMessageDialog(null, buttons[3].getText() + " Wins Game Over");
          } else if (buttons[6].getText().equals(buttons[7].getText())
              && buttons[7].getText().equals(buttons[8].getText()) && !buttons[6].getText().isEmpty()) {
            gameOver = true;
            JOptionPane.showMessageDialog(null, buttons[6].getText() + " Wins Game Over");
          } else if (buttons[0].getText().equals(buttons[3].getText())
              && buttons[3].getText().equals(buttons[6].getText()) && !buttons[0].getText().isEmpty()) {
            gameOver = true;
            JOptionPane.showMessageDialog(null, buttons[0].getText() + " Wins Game Over");
          } else if (buttons[1].getText().equals(buttons[4].getText())
              && buttons[4].getText().equals(buttons[7].getText()) && !buttons[1].getText().isEmpty()) {
            gameOver = true;
            JOptionPane.showMessageDialog(null, buttons[1].getText() + " Wins Game Over");
          } else if (buttons[2].getText().equals(buttons[5].getText())
              && buttons[5].getText().equals(buttons[8].getText()) && !buttons[2].getText().isEmpty()) {
            gameOver = true;
            JOptionPane.showMessageDialog(null, buttons[2].getText() + " Wins Game Over");
          } else if (buttons[0].getText().equals(buttons[4].getText())
              && buttons[4].getText().equals(buttons[8].getText()) && !buttons[0].getText().isEmpty()) {
            gameOver = true;
            JOptionPane.showMessageDialog(null, buttons[0].getText() + " Wins Game Over");
          } else if (buttons[2].getText().equals(buttons[4].getText())
              && buttons[4].getText().equals(buttons[6].getText()) && !buttons[2].getText().isEmpty()) {
            gameOver = true;
            JOptionPane.showMessageDialog(null, buttons[2].getText() + " Wins Game Over");
          }
        }
      }
    };
    for (JButton button : buttons) {
      button.setFont(new Font("Arial", Font.BOLD, 25));
    }
    for (JButton button : buttons) {
      button.addActionListener(buttonListener);
    }
  }
}
