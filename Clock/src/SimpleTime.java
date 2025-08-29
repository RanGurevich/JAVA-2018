/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ran70
 */
public class SimpleTime {
    
    protected int hour;
    protected int minute;
    protected int second;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public SimpleTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public SimpleTime() {
        this.hour=0;
        this.minute=0;
        this.second=0;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    private void check() {
        while(this.second>=60) {
            this.minute++;
            this.second-=60;
        }
        while(this.minute>=60) {
            this.hour++;
            this.minute-=60;
        }
        while(this.hour>=24) {
            this.hour-=24;
        }
    }
    
    public void add (SimpleTime newTime) {
        this.hour+=newTime.hour;
        this.minute+=newTime.minute;
        this.second+=newTime.second;
        check();
    }
    
    public void addHour(int hour) {
        this.hour+=hour;
        check();       
    }
    
    public void addMinute(int minute) {
        this.minute+=minute;
        check();
    }
    
    public void addSecond(int second) {
        this.second+=second;
        check();
    }
    
    public void tick() {
        this.second++;
        check();
    }
    
    public boolean equals(SimpleTime newTime) {
        return (newTime.getHour()==this.hour && newTime.getMinute()==this.minute && this.second==newTime.second)? true : false;
    }
    
    @Override
    public  String toString() {
        return this.hour+":"+this.minute+":"+this.second;
    }
    
    
    
}
