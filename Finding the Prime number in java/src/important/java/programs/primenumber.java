/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package important.java.programs;

import java.util.Scanner;
public class primenumber {
    public void main (String[]args)
    {
         int temp =0;
         Scanner S= new Scanner(System.in);
         
         System.out.println("Enter the number:");
         int n = S.nextInt();
        for(int i=2; i<=n; i++)
        {
            
            if(n%i==0)
            {
            System.out.println("The number is not prime");
            }
            else
            {
                System.out.println("the number is prime");
            }
        }
    
}
}
