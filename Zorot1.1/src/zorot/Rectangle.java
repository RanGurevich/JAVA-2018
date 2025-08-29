/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zorot;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import sun.java2d.loops.DrawRect;

/**
 *
 * @author student
 */
public class Rectangle extends Shape implements Shape2D {
    protected Point rightDown;
    public Rectangle() {
        this.rightDown.x=getMAXIMUM_XY();
        this.rightDown.y=getMAXIMUM_XY();
    }
    public Rectangle(Point handle, int sideA, int sideB) {
        this.handle=handle;
        this.rightDown.x+=sideA;
        this.rightDown.y+=sideB;
    }
    public Rectangle(Point handle, int sideA, int sideB, Color color) {
        this.handle=handle;
        this.rightDown.x+=sideA;
        this.rightDown.y+=sideB;
        this.color=color;
    }

    public void setRightDown(Point rightDown) {
        this.rightDown = rightDown;
    }

    public Point getRightDown() {
        return rightDown;
    }
    
    @Override
    public double area() {
         double sideA = this.rightDown.getX()-this.handle.getX();
         double sideB = this.rightDown.getY()-this.handle.getY();
         return sideA * sideB;
    }
    
    @Override
    public double perimerter() {
        double sideA = this.rightDown.getX()-this.handle.getX();
         double sideB = this.rightDown.getY()-this.handle.getY();
         return (sideA*2) + (sideB*2);
    }
    
    public double getWidth() {
        return this.rightDown.getX()-this.handle.getX();
    }
    
    public double getHeight() {
        return this.rightDown.getY()-this.handle.getY();
    }
    
    public static Rectangle randomRectangle() {
        Rectangle r = new Rectangle();
        Point randomPoint1 = randomPoint();
        Point randomPoint2 = randomPoint();
        r.setHandle(randomPoint1);
        r.setRightDown(randomPoint2);
        return r;       
    }
   
    public void draw(Graphics g) {
        g.drawRect(this.handle.x, this.handle.y, (int)getWidth(), (int)getHeight());
    }
    
    public void translate(int dx, int dy) {
        this.handle.setLocation(this.handle.getX()+dx, this.handle.getY()+dy);
        this.rightDown.setLocation(this.rightDown.getX()+dx, this.rightDown.getY()+dy);
    }

    @Override
    public String toString() {
        return "RECTANGLE: Handle="+super.toString();
    }
    
    
}
   
