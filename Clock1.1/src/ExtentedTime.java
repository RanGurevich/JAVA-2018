/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ran70
 */
public class ExtentedTime extends SimpleTime{
    
    protected boolean is24Hour;

    public ExtentedTime() {
        this.is24Hour=true;
        this.hour=0;
        this.minute=0;
        this.second=0;
    }

    public ExtentedTime(boolean is24Hour, int hour, int minute, int second) {
        super(hour, minute, second);
        this.is24Hour = is24Hour;
    }

public boolean getIs24Hours() {
    return this.is24Hour;
}

    public void setIs24Hour(boolean is24Hour) {
        this.is24Hour = is24Hour;
    }

@Override
public String toString() {
    if (is24Hour) {
  return this.hour+":"+this.minute+":"+this.second;
    }
    if (this.hour>=13) {
        return (this.hour-12)+":"+this.minute+":"+this.second;
    }
    return this.hour+":"+this.minute+":"+this.second;
            
}
   
    
    
}
