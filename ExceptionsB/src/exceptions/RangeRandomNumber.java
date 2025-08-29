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
    private Random rnd;

    public RangeRandomNumber(int lowRange, int upRange, int halfRange) {
        rnd = new Random();
        try {
            if (lowRange > upRange) {
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
      public void setUpRange(int upRange) {           
        try {
            if (lowRange > upRange) {
            throw new TooBigNumberException();
                }
            if (upRange < 0) {
                throw new TooSmallNumberException();
            }
            this.upRange=upRange;
        }
        catch (TooBigNumberException | TooSmallNumberException e) {
            System.err.println(e.getMessage());
           
        }
        catch(Exception e) {
            System.err.println(e);
        }    
    }
      
      public int nextRandom() throws RangeNumberException {
          int randomNum=0;
          int retNum = 0;
          int min = lowRange - halfRange;
          int max = upRange + halfRange;
          
          randomNum = generatRandomPositiveNegitiveValue(max, min);
          
          if (randomNum >= lowRange && randomNum <= upRange)
              retNum = randomNum;
          else{
            if (randomNum < lowRange){
                  throw new TooSmallNumberException(randomNum + " - Too Small");
            }
            else{
                  throw new TooBigNumberException(randomNum + " - too Big");
            }
          }
          
         return retNum;  
      }
      
      private int generatRandomPositiveNegitiveValue(int max , int min){
          return rnd.nextInt(max - min + 1) + min;
      }
}
    

    
  
    
    
