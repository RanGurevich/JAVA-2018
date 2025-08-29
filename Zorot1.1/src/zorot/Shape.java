/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zorot;

import java.awt.Color;
import java.awt.Point;
import java.util.Random;
import jdk.internal.org.objectweb.asm.Handle;

/**
 *
 * @author ran70
 */
public class Shape {
    
    protected Point handle;
    protected Color color;
    private static final int MINIMUM_XY    = 20; 
    private static final int MAXIMUM_XY    = 350;
    private static final int MAXIMUM_COLOR = 200;
    private static final int MOVE_STEP     = 20;
    
    public  Shape() {
        this.handle.x=this.MINIMUM_XY;
        this.handle.y=this.MINIMUM_XY;
        this.color=Color.black;
    }
    public Shape (Point handle, Color color) {
        this.handle=handle;
        this.color=color;
    }

    public Color getColor() {
        return color;
    }

    public Point getHandle() {
        return handle;
    }

    public static int getMAXIMUM_COLOR() {
        return MAXIMUM_COLOR;
    }

    public static int getMAXIMUM_XY() {
        return MAXIMUM_XY;
    }

    public static int getMINIMUM_XY() {
        return MINIMUM_XY;
    }

    public static int getMOVE_STEP() {
        return MOVE_STEP;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setHandle(Point handle) {
        this.handle = handle;
    }
    
    public static Point randomPoint() {
        
        Random rn = new Random();
        Point toSend = new Point();
        toSend.x = rn.nextInt(MAXIMUM_XY) + MINIMUM_XY;
        toSend.y = rn.nextInt(MAXIMUM_XY) + MINIMUM_XY;
        return toSend;
    }
    
    public Color randomColor() {
        
        Random rn = new Random();
        int randomColor = rn.nextInt(0) +MAXIMUM_COLOR;
        Color toSend = new Color(randomColor);
        return toSend;
    }

    @Override
    public String toString() {
        
        return "("+(int)this.handle.getX()+","+(int)this.handle.getY()+"), Color = ("+this.color.getRed()
                +","+this.color.getGreen()+","+this.color.getBlue()+")";
    }
    
    
    
    
}
