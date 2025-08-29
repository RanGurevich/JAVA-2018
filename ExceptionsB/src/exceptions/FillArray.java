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
public class FillArray {
    private int arraySize;
    private RangeRandomNumber number;
    private int randomNumber[];
    private static int arrayIndex=0;

    public FillArray(int arraySize) {
        this.arraySize = Math.abs(arraySize);
        this.randomNumber = new int[this.arraySize];
        for (int i = 0; i < this.arraySize; i++) {
           this.randomNumber[i] = -999; 
        }
        this.number = new RangeRandomNumber(-50,50,120);
    }

    public int getArraySize() {
        return arraySize;
    }

    public RangeRandomNumber getNumberInfo() {
        return number;
    }

    public int[] getRandomNumber() {
        return randomNumber;
    }

    public void setNumber(RangeRandomNumber number) {
        this.number = number;
    }

    public void setRandomNumber(int[] randomNumber, int arraySize) {
        this.randomNumber = randomNumber;
        this.arraySize=arraySize;
    }
    public void getNumber() {
        this.number = new RangeRandomNumber(-50,50,120);
        this.randomNumber[arrayIndex] = number.nextRandom();
        arrayIndex++;
    }
    public void emptyArray() {
        for (int i = 0; i < this.arraySize; i++) {
            this.randomNumber[i]=-999;
        }
        this.arrayIndex=0;
    }
    public boolean isFull()
    {
        for (int i = 0; i < arraySize; i++) {
            if(this.randomNumber[i]==-999)
                return false;
        }
        return true;
    }
    public void printArray () {
        for (int i = 0; i < this.arraySize; i++) {
                  System.out.print(this.randomNumber[i]+", ");  
        }
    }
    
    
    
    
    
}
