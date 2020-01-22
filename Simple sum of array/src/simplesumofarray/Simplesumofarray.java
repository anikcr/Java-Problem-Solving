/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplesumofarray;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Simplesumofarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size=0;
        int sum=0;
        int middle=0;
      Scanner S= new Scanner(System.in);
      System.out.println("Enter the array length");
      int A=S.nextInt();
      int number[]=new int[A];
        System.out.println("Enter the array element");
        for(int i=0;i<number.length;i++)
        {
        number[i]=S.nextInt();
        size=number.length;
        middle=number.length/2;
        
      sum=sum+number[i];
        
        }
         System.out.println("the size is"+size); 
         System.out.println("the sum is is"+sum); 
    }
    
}
