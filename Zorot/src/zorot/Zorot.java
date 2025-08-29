/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zorot;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author ran70
 */
public class Zorot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Point x= new Point(5,3);
       Color t = new Color(125);
        Shape z = new Shape(x, t);
        
        System.out.println(z.toString());
    }
    
}
