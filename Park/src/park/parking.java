/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package park;

/**
 *
 * @author student
 */
public class parking {
    
    private int parkingNumber;
    private boolean isEmpty;   
    
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
    
    public void leave(int carNumber)
    {
        this.isEmpty=true;
        System.out.println("Car number: "+carNumber+" left. \n parking number: "+this.parkingNumber+" is free.");
    }
    

}
