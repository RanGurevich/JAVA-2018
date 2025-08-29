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
public class ParkingCenter {
    private floor[] floors = new floor[5];
    
    public ParkingCenter(){
        for (int i = 0; i < 5; i++) {
            floors[i]= new floor();
        }
    }
    public void setFloor(int floorIndex, floor floorInfo)
    {
        floors[floorIndex]=floorInfo;
    }
    
    public boolean isAllSet() {
        for (int i = 0; i < 5; i++) {
            if (floors[i].getFloor()==-999) {
                return false;
            }
        }
        return true;
    }
    
    public boolean isSetFloor(int floorIndex) {
        return (this.floors[floorIndex].getFloor()==-999)? false : true;
    }
    
    public void EnterToParking(int trackingNumber, int carNumber) {
        int floorIndex=999;
        for (int i = 0; i < 5; i++) {
            if (floors[i].isSpotFree()) {
                floorIndex=i;
                break;
            }
        }
        if (floorIndex==999) {
            System.out.println("All the floor are full or the parking center wasn't installed currectly.");
            return;
        }
        int areaIndex = 3;
        parkingArea[] parksAreas = this.floors[floorIndex].getParkingAreas();
        for (int i = 0; i < 2; i++) {
          if (parksAreas[i].isParkingSpot())
          {
              areaIndex=i;
              break;
          }
        }
        if (areaIndex==3) {
             System.out.println("There's an error while installtion or programming, line 60.");
            return;
        }
        parking[] parks = parksAreas[areaIndex].getParkingsSpots();
        int parkingIndex = 3;
        for (int i = 0; i < 2; i++) {
          if (parks[i].getIsEmpty())
          {
              parkingIndex=i;
              break;
          }
        }
        if (parkingIndex==3) {
             System.out.println("There's an error while installtion or programming, line 73.");
            return;
        }
        this.floors[floorIndex].zones[areaIndex].parkSpot[parkingIndex].setEmpty(false);
        System.out.println("Your ticket: /n Tracking number: "+trackingNumber+
                "/n Car number: " + carNumber+"/n Floor number: "+this.floors[floorIndex].getFloor()+"\n Area color: "+this.floors[floorIndex]
        .zones[areaIndex].getColor()+"\n Parking number: "+this.floors[floorIndex].zones[areaIndex]
        .parkSpot[parkingIndex].getNum());
    }
    

}
