/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromeofanumber;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Palindromeofanumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum =0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp= n;
        while(temp!=0)
        {
        
        int r=temp%10;
        sum = sum*10+r;
        temp=temp/10;
        
        
        }
        if(n==sum)
        {
            System.out.println("the number is palindrome");
        }
        else
        {
            System.out.println("the number is not palindrome");
        }
    }
    
}
