/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ran70
 */
public class Alarm {
   protected SimpleTime time;
    protected boolean isSet;
    protected int snoozeTime;
    protected boolean isSnooze;

    public Alarm() {
        time.setHour(0);
        time.setMinute(0);
        time.setSecond(0);
        this.isSet=false;
    }

    public Alarm(SimpleTime time, boolean isSet, int snoozeTime, boolean isSnooze) {
        this.time = time;
        this.isSet = isSet;
        this.snoozeTime = snoozeTime;
        this.isSnooze = isSnooze;
    }
    

    public int getSnoozeTime() {
        return snoozeTime;
    }

    public SimpleTime getTime() {
        return time;
    }
    
    public boolean getIsSet() {
        return  this.isSet;
    }
    
    public boolean getIsSnooze() {
        return this.isSnooze;
    }

    public void setIsSet(boolean isSet) {
        this.isSet = isSet;
    }

    public void setIsSnooze(boolean isSnooze) {
        this.isSnooze = isSnooze;
    }

    public void setSnoozeTime(int snoozeTime) {
        this.snoozeTime = snoozeTime;
    }

    public void setTime(SimpleTime time) {
        this.time = time;
    }
     
}
