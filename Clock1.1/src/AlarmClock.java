/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ran70
 */
public class AlarmClock {
    protected ExtentedTime currentTIme;
    protected Alarm alaramTime[] = new Alarm[5];

    public AlarmClock() {
        for (int i = 0; i < 5; i++) {
            alaramTime[i]=null;
        }
       currentTIme= new ExtentedTime();
    }

    public AlarmClock(ExtentedTime currentTIme) {
        this.currentTIme = currentTIme;
        for (int i = 0; i < 5; i++) {
            alaramTime[i]=null;
        }
    }
       
    public void setAlarm(int alarmNumber, SimpleTime time, boolean  isSet, int snoozeTime, boolean isSnooze) {   
        this.alaramTime[alarmNumber-1] = new Alarm(time, isSet,snoozeTime, isSnooze);
    }
    
        public void setAlarm(int alarmNumber, int hours, int minute, int second, boolean  isSet, int snoozeTime, boolean isSnooze) {
        SimpleTime time = new SimpleTime(hours, minute, second);
        this.alaramTime[alarmNumber-1] = new Alarm(time, isSet,snoozeTime, isSnooze);
    }
        
    public void setAlarm(int alarmNumber, Alarm theAlarm) {   
        this.alaramTime[alarmNumber-1] = theAlarm;
    }

    public Alarm[] getAlaramTime() {
        return alaramTime;
    }
     
    
    
   
    
    
}
