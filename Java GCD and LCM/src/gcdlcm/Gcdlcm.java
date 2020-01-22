/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcdlcm;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Gcdlcm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rem;
        int lcd = 0;
        Scanner S = new Scanner (System.in);
        System.out.println("enter two number");
        int num1 = S.nextInt();
        int num2 = S.nextInt();
        int n1=num1;
       int n2=num2;
        while(n2!=0)
        {
        rem = n1%n2;
        n1=n2;
       n2 = rem;
       lcd = num1*num2/n1;
       
        }
        System.out.println("The LCD  is " +n1);
        System.out.println("The  gcd is " +lcd);
        
    }
    
}
