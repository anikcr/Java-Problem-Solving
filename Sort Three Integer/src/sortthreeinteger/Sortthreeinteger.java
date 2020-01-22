/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortthreeinteger;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Sortthreeinteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("enter three integer");
        int A=S.nextInt();
        int B=S.nextInt();
        int C=S.nextInt();
        //sorting A and B
        if(A>B)
        {
        int temp=A;
        A=B;
        B=temp;
        
        
        }
        //sorting of b c
        if (B>C)
        {
        int temp= B;
        B=C;
        C=temp;
        
        
        }
        System.out.println("The sorted numbers are "
      + A + " " + B + " " + C);
    }
 
    
    
}
