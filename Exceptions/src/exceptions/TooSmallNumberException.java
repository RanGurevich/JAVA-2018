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
public class TooSmallNumberException extends RangeNumberException{

    public TooSmallNumberException() {
        super("Too small number exception thrown.");
    }

    public TooSmallNumberException(String massenge) {
        super(massenge);
    }  
       
}
