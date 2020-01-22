/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseanumber;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Reverseanumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0;
        Scanner S = new Scanner(System.in);
        System.out.println("enter the number");
        int n = S.nextInt();
        int temp= n;
        while(temp!=0)
        {
        int r=temp%10;
        sum= sum*10+r;
        temp=temp/10;
        
        
        
        }
        System.out.println("the revrse of number :"+sum);
        
    }
    
}
