

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class cubes extends JApplet implements ActionListener
{
	int picxelInt;
	int hieght;
	int width;
	int countCubes=0;
	int startWidth;
	Boolean firstTime=true;
	public void init()
	{
		// Applet init() method
		
		String numOfPicxals = JOptionPane.showInputDialog("Enter how many pixcels: ");
		picxelInt = Integer.parseInt(numOfPicxals);
		
		
	}
	
	// implementation of ActionListener interface
	@Override
	public void actionPerformed(ActionEvent e) {
	
	
	}
	@Override
	public void paint(Graphics  g)
	{
		// getting information and declring varables in order to paint as order
		setStartAndCount();
		hieght=getHeight();
		width=getWidth();
		int endWidth=getWidth()-picxelInt;
		g.drawRect(0, hieght, picxelInt, picxelInt);
		g.setColor(Color.RED);
		
		// before doing
		for (int i = 0; i < countCubes; i++)
		{
			g.drawRect(startWidth, hieght-picxelInt, picxelInt, picxelInt);
			startWidth+=picxelInt;
			
		}
		
		
		
		
		System.out.println("hieght: "+hieght);
		System.out.println("width: "+width);
	}
	public void setStartAndCount()
	{
		hieght=getHeight();
		width=getWidth();
		int endWidth=getWidth()-picxelInt;
		int pixcelSum=0;
		
		// before doing
		
		for (int i = 0; i < width; i+=picxelInt)
		{
			if (i+picxelInt<endWidth)
			{
				countCubes++;
				pixcelSum+=picxelInt;
			}
		}
		startWidth=(width-pixcelSum)/2;
	}
}


