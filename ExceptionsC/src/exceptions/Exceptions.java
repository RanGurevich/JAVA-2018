/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Random;

/**
 *
 * @author ran70
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FillArray numArr = new FillArray(-5);
        System.out.println("Starting to fill the array...");
        while(!numArr.isFull())
        {
            numArr.getNumber();
        }
        System.out.println("The array is full. \n The Array is: ");
        numArr.printArray();
        
    }
    
}
