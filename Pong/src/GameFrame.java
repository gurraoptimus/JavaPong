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
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);
      this.setVisible(true);
      this.setResizable(false);
      this.setBackground(Color.black);
      this.pack();
      
  }
}