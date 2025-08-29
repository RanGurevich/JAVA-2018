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
public class RangeRandomNumber {
    private int lowRange;
    private int upRange;
    private int halfRange;

    public RangeRandomNumber(int lowRange, int upRange, int halfRange) {
        try {
            if (lowRange >upRange) {
            throw new TooBigNumberException();
                }
            this.halfRange=halfRange;
            this.lowRange=lowRange;
            this.upRange=upRange;
        }
        catch(Exception e) {
            System.err.println(e);
        }    
    }

    public int getHalfRange() {
        return halfRange;
    }

    public int getLowRange() {
        return lowRange;
    }

    public int getUpRange() {
        return upRange;
    }

    public void setHalfRange(int halfRange) {
                try {
            this.halfRange=halfRange;
        }
        catch(Exception e) {
            System.err.println(e);
        }    
    }
    
        public void setLowRange(int lowRange) {           
        try {
            if (lowRange >upRange) {
            throw new TooBigNumberException();
                }
            if (lowRange < 0) {
                throw new TooSmallNumberException();
            }
            this.lowRange=lowRange;
        }
        catch (TooBigNumberException | TooSmallNumberException e) {
            System.err.println(e);
        }
        catch(Exception e) {
            System.err.println(e);
        }    
    }
      public void setUpRange(int upRange) throws RangeNumberException {           
            if (lowRange > upRange) {
            throw new TooBigNumberException();
                }
            if (upRange < 0) {
                throw new TooSmallNumberException();
            }
            this.upRange=upRange;
    }
      
      public int nextRandom() throws RangeNumberException{
          int randomNum=0;
            Random rnd = new Random();
           randomNum = generatRandomPositiveNegitiveValue(this.halfRange, -this.lowRange);
           try {
               
           
              System.out.println(randomNum);
              if (randomNum < lowRange) {
                 throw new TooSmallNumberException();                 
              }
              if (randomNum > upRange) {
                  throw new TooBigNumberException();
              } 
           }
           catch (Exception ex)
           {
               System.err.println(ex.getMessage());
           }
         return randomNum;
      }
      private int generatRandomPositiveNegitiveValue(int max , int min) {
    int ii = -min + (int) (Math.random() * ((max - (-min)) + 1));
    return ii;
}
}
    

    
  
    
    
