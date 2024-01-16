//importing packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GameFrame
{
  boolean playAi = false;
  boolean startGame = false;
  void run()//procedure to set up window and game
  {
    Draw draw = new Draw();//making instance of Draw class called draw
    ////////////////////////////////////////////////////
	JFrame frame = new JFrame("Module 3"); //making instance of JFrame class called frame 
    draw.setPreferredSize(new Dimension(600,600));
	frame.add(draw);//adding draw to frame
    frame.setSize(600,600);//setting size of window
    frame.setBackground(Color.black);//setting background colour of window
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//default close operation
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);//maximizing window
	frame.setVisible(true);
	////////////////////////////////////////////////////
	/*JFrame menu = new JFrame("Menu");
	menu.setSize(640,480);
	menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel menu2 = new JPanel();
	menu2.setLayout(new GridBagLayout());
	JButton[] buttons = new JButton[2];
    buttons[0] = new JButton("Single Player");
    buttons[1] = new JButton("2 Players");
	GridBagConstraints constraints = new GridBagConstraints();
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.insets = new Insets(0,0,10,10);
    menu2.add(buttons[0],constraints);
    constraints.gridx = 0;
    constraints.gridy = 1;
    constraints.insets = new Insets(0,0,10,10);
    menu2.add(buttons[1],constraints);
    menu.add(menu2);
	menu.setVisible(true);
	buttons[0].addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			menu.setVisible(false);
			frame.setVisible(true);
      		playAi = true;
		}
	});
	buttons[1].addActionListener(new ActionListener() 
	{
		GameFrame gameframe = new GameFrame();
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			menu.setVisible(false);
			frame.setVisible(true);
     
		}
	});*/
    while(true)//loop to keep calling update to check if there is a collision
    {
      draw.update(playAi);
      try
      {
        Thread.sleep(10);
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
  }

  
}