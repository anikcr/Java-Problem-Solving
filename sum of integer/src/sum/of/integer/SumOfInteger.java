/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum.of.integer;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class SumOfInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int sum =0;
      int r;
      Scanner S = new Scanner(System.in);
      int n= S.nextInt();
      int temp = n;
      while(temp!=0){
      
       r = temp%10;
       sum = sum+r;
       temp= temp/10;
    
      
      }
         System.out.println("sum of the integer" +sum);
    }
    
}
