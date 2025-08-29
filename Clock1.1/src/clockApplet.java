/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.sun.org.apache.xerces.internal.impl.Constants;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Label;
import java.security.Timestamp;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import java.awt.event.*;
import javafx.scene.control.Alert;

/**
 *
 * @author student
 */
public class clockApplet extends Applet implements ActionListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
    ExtentedTime theTime = new ExtentedTime();
    Timer timer;
    AudioClip audioClip;
    Boolean show24hours = false;
   //  Alarm alert1;
     Alarm alert2;
    Label timeLabel;
     Button alert1b;
     Button alert2b;
     SimpleTime alert1t;
     AlarmClock theClock;
     
    public void init() {
                
                
                timeLabel = new Label();
                timer = new Timer();
                alert1b = new Button("Add Alert1");
                alert2b = new Button("Add Alert2");
                String timeInput = JOptionPane.showInputDialog("Enter the time in the format HH:MM:SS");
                String[] timeParts = timeInput.split(":");               
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Show the hour in 24hours format?", "show in 24?", dialogButton);
                if(dialogResult == 0) {
                 show24hours=true;
                } 
                theTime = new ExtentedTime(show24hours,Integer.parseInt(timeParts[0]),Integer.parseInt(timeParts[1]),Integer.parseInt(timeParts[2]));
                timeLabel.setText(theTime.toString());
                theClock = new AlarmClock(theTime);
                add(timeLabel);
                add(alert1b);
                alert1b.addActionListener(this);
                add(alert2b);
                alert2b.addActionListener(this);
                timer.schedule(new TimerTask() {
              
              public void run() {
                  try {
                      theTime.tick();
                      timeLabel.setText(theTime.toString());
                      Alarm AlarmArr[] = theClock.getAlaramTime();
                      for (int i = 0; i < 5; i++) {                     
                      if (AlarmArr[i].time.equals(theClock.currentTIme)) {
                         audioClip = getAudioClip(getCodeBase(), "Alarm-Clock-Sound.wav");
                         audioClip.play();
                         
                          if ( AlarmArr[i].getIsSnooze()) {
                              AlarmArr[i].setIsSnooze(false);
                             AlarmArr[i].getTime().addMinute(AlarmArr[i].getSnoozeTime());
                          }                    
                  }
                      }
                  }
                  catch(Exception ex) {
                     
                  }
              }
          },0,1000);                               
    }
    
       public void actionPerformed(ActionEvent e) {
         String st = e.getActionCommand();
           if (st.equals("Add Alert1")) {
               String alart1Input = JOptionPane.showInputDialog("Enter the alert in the format HH:MM:SS,will ring (true, false),time to sonnze,if snooze(true/false)");
                String[] alert1Parts = alart1Input.split(",");
                String[] spliteTime = alert1Parts[0].split(":");
                 alert1t = new SimpleTime(Integer.parseInt(spliteTime[0]),Integer.parseInt(spliteTime[1]),Integer.parseInt(spliteTime[2]));  
             theClock.setAlarm(1,alert1t,alert1Parts[1].equals("true") ? true : false,
                      Integer.parseInt(alert1Parts[2]),alert1Parts[3].equals("true") ? true : false);
             
             alert1b.setLabel((alert1Parts[3].equals("true"))? "Alert in: "+alert1t.toString()+"/n Snooze in more "+alert1Parts[2]
                     +"minutes":"Alert in: "+alert1t.toString());
                              
           }
           if (st.equals("Add Alert2")) {
               String alart2Input = JOptionPane.showInputDialog("Enter the alert in the format HH:MM:SS,will ring (true, false),time to sonnze,if snooze(true/false)");
                String[] alert2Parts = alart2Input.split(",");
                String[] spliteTime = alert2Parts[0].split(":");
                 alert1t = new SimpleTime(Integer.parseInt(spliteTime[0]),Integer.parseInt(spliteTime[1]),Integer.parseInt(spliteTime[2]));  
             theClock.setAlarm(1,alert1t,alert2Parts[1].equals("true") ? true : false,
                      Integer.parseInt(alert2Parts[2]),alert2Parts[3].equals("true") ? true : false);
             
             alert2b.setLabel((alert2Parts[3].equals("true"))? "Alert in: "+alert1t.toString()+"/n Snooze in more "+alert2Parts[2]
                     +"minutes":"Alert in: "+alert1t.toString());
           }
           
 
      }
}



