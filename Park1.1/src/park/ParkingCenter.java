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
public class ParkingCenter extends Thread {
    private final int floorsAmount=5;
    private final int parkingAmount=2;
    private final int parkingAreaAmount=2;
    private floor[] floors = new floor[floorsAmount];
    
    public ParkingCenter(){
        for (int i = 0; i < floorsAmount; i++) {
            floors[i]= new floor();
        }
    }
    public void setFloor(int floorIndex, floor floorInfo)
    {
        floors[floorIndex]=floorInfo;
    }
    
    public boolean isAllSet() {
        for (int i = 0; i < floorsAmount; i++) {
            if (floors[i].getFloor()==-999) {
                return false;
            }
        }
        return true;
    }
    
    public boolean isSetFloor(int floorIndex) {
        return (this.floors[floorIndex].getFloor()==-999)? false : true;
    }
    
    public void EnterToParking(Car theCar) {

        int floorIndex=999;
        for (int i = 0; i < floorsAmount; i++) {
            if (floors[i].isSpotFree()) {
                floorIndex=i;
                break;
            }
        }
        if (floorIndex==999) {
            System.out.println("All the floor are full or the parking center wasn't installed currectly.");
            return;
        }
        int areaIndex = parkingAreaAmount+1;
        parkingArea[] parksAreas = this.floors[floorIndex].getParkingAreas();
        for (int i = 0; i < parkingAreaAmount; i++) {
          if (parksAreas[i].isParkingSpot())
          {
              areaIndex=i;
              break;
          }
        }
        if (areaIndex==parkingAreaAmount+1) {
             System.out.println("There's an error while installtion or programming, line 60.");
            return;
        }
        parking[] parks = parksAreas[areaIndex].getParkingsSpots();
        int parkingIndex = parkingAmount+1;
        for (int i = 0; i < parkingAmount; i++) {
          if (parks[i].getIsEmpty())
          {
              parkingIndex=i;
              break;
          }
        }
        if (parkingIndex==parkingAmount+1) {
             System.out.println("There's an error while installtion or programming, line 73.");
            return;
        }
        this.floors[floorIndex].zones[areaIndex].parkSpot[parkingIndex].setCar(theCar);
        System.out.println("Your ticket: \n Tracking number: "+theCar.getTrackingNumber()+
                "\n Car number: " + theCar.getCarNumber()+"\n Floor number: "+this.floors[floorIndex].getFloor()+"\n Area color: "+this.floors[floorIndex]
        .zones[areaIndex].getColor()+"\n Parking number: "+this.floors[floorIndex].zones[areaIndex]
        .parkSpot[parkingIndex].getNum());
    }
    
    public void leave(Car theCar)
    {
        for (int i = 0; i < floorsAmount; i++) {
            for (int j = 0; j < parkingAreaAmount; j++) {
                for (int k = 0; k < parkingAmount; k++) {
                    parking parkToCheck = this.floors[i].zones[j].parkSpot[k];
                    if (parkToCheck.getTheCarIn()!=null && parkToCheck.getTheCarIn().getTrackingNumber()==theCar.getTrackingNumber()) {
                        parkToCheck.leave();
                        break;
                    }
                }
            }
        }
        System.out.println("The car does not parking in the parking center");
    }
}
