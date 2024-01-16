import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color; 

public class Borders extends JPanel
{
  int p1Score = 0;
  int p2Score = 0;

  public void drawBorder(Graphics g)
  {
    //point borders, left and right
    g.setColor(Color.RED);
    g.fillRect(0,0,5,340);
    g.fillRect(565,0,5,350);

    //bounce borders, top and bottom
    g.setColor(Color.GRAY);
    g.fillRect(0,0,565,10);
    g.fillRect(0,340,565,10);

    //Show scores
    g.drawString(Integer.toString(p1Score), 263, 20);
    g.drawString(Integer.toString(p2Score), 295, 20);
  }
}