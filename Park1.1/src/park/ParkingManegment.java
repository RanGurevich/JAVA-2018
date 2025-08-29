/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package park;

import java.util.Random;

/**
 *
 * @author student
 */
public class ParkingManegment{
    public static int randomEntering()
    {
        Random random = new Random();
        int  rnd = random.nextInt(20) + 5;
        return rnd;
    }
        public static int randomLeaving()
    {
        Random random = new Random();
        int  rnd = random.nextInt(60) + 30;
        return rnd;
    }
    
    public static void main(String[] args) {
        int time;
        parking p1 = new parking(584,true);
        parking p2 = new parking(432,true);
        parking p3 = new parking(17,true);
        parking p4 = new parking(9,true);
        parking p5 = new parking(584,true);
        parking p6 = new parking(432,true);
        parking p7 = new parking(542,true);
        parking p8 = new parking(36,true);
        parking p9 = new parking(874,true);
        parking p10 = new parking(8752,true);
        parking p11 = new parking(152,true);
        parking p12 = new parking(745,true);
        parking p13 = new parking(872,true);
        parking p14 = new parking(21321,true);
        parking p15 = new parking(87521,true);
        parking p16 = new parking(2156,true);
        parking p17 = new parking(455241,true);
        parking p18 = new parking(785,true);
        parking p19 = new parking(21563,true);
        parking p20 = new parking(54212,true);
        parkingArea area1 = new parkingArea("red");
        area1.setParkings(p1, p2);
        parkingArea area2 = new parkingArea("white");
        area2.setParkings(p3, p4);
        parkingArea area3 = new parkingArea("green");
        area3.setParkings(p5, p6);
        parkingArea area4 = new parkingArea("blue");
        area4.setParkings(p7, p8);
        parkingArea area5 = new parkingArea("yellow");
        area5.setParkings(p9, p10);
        parkingArea area6 = new parkingArea("black");
        area6.setParkings(p11, p12);
        parkingArea area7 = new parkingArea("pink");
        area7.setParkings(p13, p14);
        parkingArea area8 = new parkingArea("brown");
        area8.setParkings(p15, p16);
        parkingArea area9 = new parkingArea("orange");
        area9.setParkings(p17, p18);
        parkingArea area10 = new parkingArea("gold");
        area10.setParkings(p19, p20);
        floor f1 = new floor(-1);
        f1.setParkingArea(area1, area2);
        floor f2 = new floor(-2);
        f2.setParkingArea(area3, area4);
        floor f3 = new floor(-3);
        f3.setParkingArea(area5, area6);
        floor f4 = new floor(-4);
        f4.setParkingArea(area7, area8);
        floor f5 = new floor(-5);
        f1.setParkingArea(area9, area10);
        ParkingCenter center = new ParkingCenter();
        center.setFloor(0, f1);
        center.setFloor(1, f2);
        center.setFloor(2, f3);
        center.setFloor(3, f4);
        center.setFloor(4, f5);
        System.out.println(center.isAllSet());
        Car c1 = new Car(1, 5121321,randomEntering(),randomLeaving());
        Car c2 = new Car(2, 251210,randomEntering(),randomLeaving());
        Car c3 = new Car(3, 5441321,randomEntering(),randomLeaving());
        Car c4 = new Car(4, 25121,randomEntering(),randomLeaving());
        Car c5 = new Car(5, 152321,randomEntering(),randomLeaving());
        Car c6 = new Car(6, 35421121,randomEntering(),randomLeaving());
        Car c7 = new Car(7, 2151,randomEntering(),randomLeaving());
        Car c8 = new Car(8, 899872,randomEntering(),randomLeaving());
        Car c9 = new Car(9, 898721,randomEntering(),randomLeaving());
        Car c10 = new Car(10, 987452,randomEntering(),randomLeaving());
        Car c11 = new Car(11, 131585,randomEntering(),randomLeaving());
        Car c12 = new Car(12, 354785,randomEntering(),randomLeaving());
        Car c13 = new Car(13, 751274,randomEntering(),randomLeaving());
        Car c14 = new Car(14, 645521,randomEntering(),randomLeaving());
        Car c15 = new Car(15, 3221321,randomEntering(),randomLeaving());
       
        center.EnterToParking(c2);
        center.leave(c2);
//        center.EnterToParking(c3);
//        c3.getOutFromParking();
//        center.EnterToParking(c4);
//        c4.getOutFromParking();
//        center.EnterToParking(c5);
//        center.EnterToParking(c6);
//        c5.getOutFromParking();
//        center.EnterToParking(c7);
//        center.EnterToParking(c8);
//        center.EnterToParking(c9);
//        c8.getOutFromParking();
//        center.EnterToParking(c10);
//        center.EnterToParking(c11);
//        center.EnterToParking(c12);
//        center.EnterToParking(c13);
//        center.EnterToParking(c14);   
    }     
}
