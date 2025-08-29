

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class cubes extends JApplet implements ActionListener 
{
int picxelInt;
int hieght;
int width;
int countCubes=0;
int startWidthFirst;
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
hieght=getHeight();
        width=getWidth();
        int endWidth=getWidth();
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
            startWidthFirst=(width-pixcelSum)/2;
            int startWidthUSE=(width-pixcelSum)/2;
        g.setColor(Color.RED);
        // before doing      
        boolean firstTime=true;
        int picxceldid=0;
        int line=1;
        for (int j  = picxelInt+1; j < hieght; j+=picxelInt) 
        {
                         for (int i = 0; i < countCubes; i++) 
            {       
                    if (picxceldid<pixcelSum) 
                    {
                    g.drawRect(startWidthUSE, hieght-j, picxelInt, picxelInt); 
                    startWidthUSE+=picxelInt;
                    picxceldid+=picxelInt;                    
                    }  
                  
        }
         line++;
         countCubes--;
         //startWidthUSE=startWidthFirst+(picxelInt/2)*line;     
          pixcelSum-=picxelInt;
          startWidthUSE=(width-picxceldid)/2;
          startWidthUSE+=picxelInt/2;
         //  picxceldid=(picxelInt/2)*line;
         picxceldid=0;
        }

    }
   }


