//import java.awt.*;
//import java.awt.event.*;
//import java.util.*;
//import javax.swing.*;

public class Paddle extends Rectangle{
    int id;
    int yVelocity;
    int speed=10;
    
    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.id=id;
    }
    public void KeyPressed(KeyEvent e){
            switch(id){
              case 1:
                  if(e.getKeyCode()==KeyEvent.VK_W){
                    setYDirection(-speed);
                    move();
                  }
                  if(e.getKeyCode()==KeyEvent.VK_S){
                    setYDirection(speed);
                    move();
                  }
            }
    }
    public void KeyReleased(KeyEvent e){
            
    }
    public void setYDirection(int yDirection){

    }
    public void move(){
        
    }
    public void draw(Graphics g){
        if(id==1)
            g.setColor(Color.blue);
        else
            g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }
}