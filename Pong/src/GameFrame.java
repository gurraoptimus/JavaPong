import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame{
  GamePanel panel;
  GameFrame(){   
      panel=new GamePanel();
      this.add(panel);
      this.setTitle("Java Pong");
      this.setResizable(false);
      this.setBackground(Color.black);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.pack();
      this.setVisible(true);
      this.steLocationRelativeTo(null);
      
  }
}