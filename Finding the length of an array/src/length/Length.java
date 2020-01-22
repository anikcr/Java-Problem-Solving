/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package length;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Length {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int result =0;
         int sum=0;
        Scanner S = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0; i<5; i++)
        {
      a[i]= S.nextInt();
      sum = sum+a[i];
        result = sum-a[0];
        }
        System.out.println("the result is"+result);
    }
    
}
