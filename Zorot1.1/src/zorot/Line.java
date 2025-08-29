/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zorot;

import java.awt.Point;
import java.awt.Graphics;

/**
 *
 * @author ran70
 */
public class Line extends Shape implements MoveAble{
    
    protected Point endLIne;
    
    public Line() {
        
        this.endLIne.x = getMAXIMUM_XY();
        this.endLIne.y = getMAXIMUM_XY();
        
    }
    public Line(int xEnd, int yEnd, Point handle) {
        super();      
        this.handle=handle;
        this.endLIne.x = xEnd;
        this.endLIne.y = yEnd; 
    }
    
    public void randomLine() {
        
        Point toSendPoint = randomPoint();     
    }
    
    public void draw(Graphics g) {
        
       g.drawLine((int)this.handle.getX(), (int)this.handle.getY(), this.endLIne.x, this.endLIne.y);
    }
    
    public double getLength() {
    return Math.hypot(this.handle.x-this.endLIne.x, this.handle.y-this.endLIne.y);
    }
    
   public void translate(int dx, int dy) {
       
       this.handle.x=dx;
       this.handle.y=dy;    
   }
   
   @Override
   public void moveUp(int moveStep) {
       this.handle.y+=moveStep;
       this.endLIne.y+=moveStep;
   }
   
   @Override
   public void moveDown(int moveStep) {
       
      this.handle.y-=moveStep;
       this.endLIne.y-=moveStep; 
   }
   
   @Override
   public void moveLeft (int moveStep){
       
       this.handle.x+=moveStep;
       this.endLIne.x+=moveStep; 
   }
   
   @Override
   public void moveRight (int moveStep) {
       
       this.handle.x-=moveStep;
       this.endLIne.x-=moveStep; 
   }

    @Override
    public String toString() {
        return "LINE: From("+this.endLIne.x+","
                +this.endLIne.y+") TO "+super.toString();
    }
   
   
}
