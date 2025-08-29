/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author ran70
 */
public class TooBigNumberException extends RangeNumberException{
    
    public  TooBigNumberException() {
        super("Too big number exception thrown.");
    }

    public TooBigNumberException(String massenge) {
        super(massenge);
    }  
       
}
