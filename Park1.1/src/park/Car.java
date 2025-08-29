package park;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ran70
 */
public class Car extends Thread{
    private int trackingNumber;
    private int carNumber;
    private int enteringTime;
    private int leaveTime;
    
    public Car (int trackingNumber, int carNumber, int enteringTime, int leaveTime)
    {
        this.trackingNumber=trackingNumber;
        this.carNumber=carNumber;
        this.enteringTime=enteringTime;
        this.leaveTime=leaveTime;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public int getEnteringTime() {
        return enteringTime;
    }

    public int getLeaveTime() {
        return leaveTime;
    }

    public int getTrackingNumber() {
        return trackingNumber;
    }
    

    public void setEnteringTime(int enteringTime) {
        this.enteringTime = enteringTime;
    }

    public void setLeaveTime(int leaveTime) {
        this.leaveTime = leaveTime;
    }
    
}
