/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestediselse;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Nestediselse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        System.out.println("Enter the three integer");
        int J= S.nextInt();
         int K= S.nextInt();
         int L = S.nextInt();
         if(J>K)
         {
             if(J>L)
             {
             
             System.out.println(J+" is the larger");
             
             }
         
         }
         else{
         
         
         System.out.println("k is and l is smaller");
         }
         
    }
    
}
