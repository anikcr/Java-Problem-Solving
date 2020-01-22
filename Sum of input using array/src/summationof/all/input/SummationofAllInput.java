/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summationof.all.input;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class SummationofAllInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0;
       Scanner S= new Scanner(System.in);
       int A =S.nextInt();
       int number[]=new int[A];
       for(int i=0; i<number.length;i++)
       {
       number[i]=S.nextInt();
       sum = sum+number[i];
       
       }
       System.out.println("the sum is"+sum);
       
    }
    
}
