/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber1;

import java.util.Scanner;

/**
 *
 * @author Anik
 */
public class Primenumber1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int check =0;
         Scanner S= new Scanner(System.in);
         
         System.out.println("Enter the number:");
         int n = S.nextInt();
        for(int i=2; i<n; i++)
            
        {
            
            if(n%i==0)
            {
            check++;
            break;
            }
            
        }
        if(check==0)
        {
            System.out.println("the number is prime");
        }
        else
        {
            System.out.println("The nmber is  not prime");
        }
    
}
    }
    

