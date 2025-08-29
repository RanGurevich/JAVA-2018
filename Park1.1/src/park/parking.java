/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package park;

import static java.lang.Thread.sleep;

/**
 *
 * @author student
 */
public class parking  extends Thread {
    
    private int parkingNumber;
    private boolean isEmpty;
    private Car theCarIn;
    
    public parking(int parkingNumber, boolean isEmpty)
    {
        this.parkingNumber=parkingNumber;
        this.isEmpty=isEmpty;
    }
     public parking()
    {
        this.parkingNumber=0;
        this.isEmpty=false;
    }
    
    public void setNum(int num)
    {
        this.parkingNumber=num;
    }
    
    public void setEmpty(boolean isEmpty)
    {
        this.isEmpty=isEmpty;
    }
    
    public int getNum()
    {
        return this.parkingNumber;
    }
    
    public boolean getIsEmpty()
    {
        return this.isEmpty;
    }

    public Car getTheCarIn() {
        return theCarIn;
    }  
    
    public void setCar (Car theCar)
    {
        try{
       sleep(theCar.getEnteringTime()*1000);
       this.theCarIn=theCar;
       this.isEmpty=false;
        }
        catch(Exception ex)
                {
                    System.out.println(ex.toString());
                }
    }
    
    public void leave()
    {
        try{
        sleep(this.theCarIn.getLeaveTime()*1000);
        this.isEmpty=true;
        System.out.println("Car number: "+this.theCarIn.getCarNumber()+" left. \n parking number: "+this.parkingNumber+" is free.");
        this.theCarIn=null;
        }
                catch(Exception ex)
                {
                    System.out.println(ex.toString());
                }
    }
    

}
