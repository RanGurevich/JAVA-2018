
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cubes extends JApplet implements ActionListener {
int PicalInt;
    
    private JTextArea displayBoard;  
    @Override
    public void init() {   
        // Applet init() method
        
        String numOfPicals = JOptionPane.showInputDialog("Enter how many pixcels: ");
         PicalInt = Integer.parseInt(numOfPicals);
              
    }
    // implementation of ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    @Override
    public void paint(Graphics  g)
    {
      
     } 
    }
   



