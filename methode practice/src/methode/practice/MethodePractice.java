/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methode.practice;

/**
 *
 * @author Anik
 */
public class MethodePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("the sum of two number is"+ a(10,12));
       
    }
    public static int a(int i1, int i2)
            
    {
        int result = 0;
        if(i1%2==0&&i2%2==0)
             result =i1+i2;
        return result;
    }
    
    
}
