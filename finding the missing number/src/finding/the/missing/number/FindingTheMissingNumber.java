/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finding.the.missing.number;

/**
 *
 * @author Anik
 */

public class FindingTheMissingNumber {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      int sum=0;
      int sum1=0;
      int result=0;
    
        int[] total = new int[]{ 1,2,4,5,6,7,8,9,50 };
        int size= total.length;
        for(int i=0; i<total.length; i++)
        {
        sum = sum+total[i];
        
        }
        for(int j=0; j<=10;j++)
        {
        sum1= sum1+j;
        }
           
        result = sum1-sum;
        System.out.println("the missing number is :" +result);
    }
    
}
