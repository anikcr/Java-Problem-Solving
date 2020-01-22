/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int fibo=0;
      int first =0;
      int second=1;
    
      Scanner S = new Scanner(System.in);
      System.out.println("Enter the number");
      
      int n = S.nextInt();
      System.out.print(first+ "" +second);
      
      for(int i=3; i<=n; i++)
      {
          fibo = first+second;
      System.out.print(" "+fibo);
      first = second;
      second = fibo;
          
      
          
    }
    
}
}
