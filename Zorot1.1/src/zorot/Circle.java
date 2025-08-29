/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zorot;

import java.awt.Point;
import java.util.Random;

/**
 *
 * @author student
 */
public class Circle extends Shape {
    
  private int radius;
  
  public Circle() {
      this.radius = getMAXIMUM_XY();
  }
  
  public Circle (int radius, int x, int y)
  {
    this.radius=radius;
    this.handle.x=x;
    this.handle.y=y;
  }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    private int randomRadius() {
        Random rn = new Random();
      return rn.nextInt(getMAXIMUM_XY()) + getMINIMUM_XY();
    }
    
    public static Circle() {
        
    }
  
    
}
