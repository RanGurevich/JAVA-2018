/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package park;

/**
 *
 * @author ran70
 */
public class floor {
    private int num;
   public parkingArea[] zones = new parkingArea[2];
    
    public  floor(int num) {
        this.num=num;
    }
    public  floor() {
        this.num=-999;
    }
    public void setParkingArea(parkingArea area1, parkingArea area2) {
        this.zones[0]=area1;
        this.zones[1]=area2;
    }
    
    public void setParkingArea(parkingArea[] areas) {
        this.zones=areas;
    }
    
  public int getFloor()
  {
      return this.num;
  }
  
  public parkingArea[] getParkingAreas()
  {
      return this.zones;
  }
  
  public boolean isSpotFree()
  {
      for (int i = 0; i < 10; i++) {
          if (this.zones[i].isParkingSpot())
              return true;
      }
      return false;
  }
  
  public void printBoard()
  {
      String info = isSpotFree() ? "Theres free parking spots":"Theres no free parking spots";
      System.out.println(info);
  }
      
}
