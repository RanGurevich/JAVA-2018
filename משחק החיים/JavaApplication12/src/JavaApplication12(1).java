
import java.applet.Applet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  public class JavaApplication12 extends Applet implements Runnable {
      private Container c;
	private JTextArea displayBoard;		// display board
	private JButton   nextGeneration;
        
        Thread thread =new Thread(this);
    public void init()
    { 
        setSize(500,500);
    }
    public void start()
    {
        thread.start();
    }
    public void destory(){}
    public void stop(){}
    public void run(){
    
            }
}
