/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fact = 1;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = S.nextInt();
        for(int i=1; i<=n; i++)
        {
            fact = fact*i;
            
        }
        System.out.println("the factorial of given number" + fact);
        }
        
    }
    

