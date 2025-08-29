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
public class parkingArea {
    parking[] parkSpot = new parking[2];
    private String color;        
    
    public parkingArea(String color)
            {
                this.color=color;
            }
      public parkingArea()
            {
                this.color="Not installed.";
            }
    public void setColor(String color)
    {
        this.color=color;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    public void setParkings(parking park1, parking park2)
    {
        this.parkSpot[0]=park1;
        this.parkSpot[1]=park2;
    }
    
  public parking[] getParkingsSpots()
    {
        return this.parkSpot;
    }
    
    public int getFreeSpots()
    {
        int count=0;
        for (int i = 0; i < 2; i++) {
           count += (this.parkSpot[i].getIsEmpty())? 1:0;
        }
        return count;
    }
    
    public boolean isParkingSpot()
    {
        return ((getFreeSpots()==0) ? false:true);
    }

}
