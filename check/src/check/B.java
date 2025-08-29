/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

/**
 *
 * @author ran70
 */


public class B extends A
{
private static int count = 0;
    public B(int k)
    {
        System.out.println(k);
        A a = new A(10);
        A a1 = new A(k);
        
    }
}

