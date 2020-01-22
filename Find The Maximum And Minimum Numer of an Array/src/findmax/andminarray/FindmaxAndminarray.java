/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findmax.andminarray;

/**
 *
 * @author Anik
 */
import java.util.Scanner;

public class FindmaxAndminarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
int sum=0;
        Scanner S = new Scanner(System.in);
          System.out.println("Enter the numbr of array you want to enter");
              int A = S.nextInt();
        int n[] = new int[A];
         
        System.out.println("Enter yout input");
        for (int i = 0; i < n.length; i++) {
            n[i] = S.nextInt();
            sum = sum+n[i];
        }
        System.out.println("sum is"+sum);
        
        
        int max = n[0];
          int   min = n[0];
        
         for (int i = 1; i < 5; i++)
         {
          
            if (max < n[i]) {
                max = n[i];

            }
            if (min > n[i]) {

                min = n[i];

            }

        }
        System.out.println("the maximum number is " + max);

        System.out.println("the minium number is " + min);
    }

}
