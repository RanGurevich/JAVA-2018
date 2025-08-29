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
public class RangeNumberException extends Exception {
    
    public  RangeNumberException() {
        super("Range number exception thrown.");
    }

    public RangeNumberException(String massenge) {
        super(massenge);
    }      
}
