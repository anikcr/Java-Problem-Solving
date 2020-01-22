/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beggestnumberamngthree;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Beggestnumberamngthree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S= new Scanner (System.in);
        System.out.println("Enter you three number");
        int A=S.nextInt();
        int B =S.nextInt();
        int C=S.nextInt();
        if(A>B&&A>C)
        {
        System.out.println(A+"is the biggest number");
        
        }
        if(B>A&&B>C)
        {
        
            System.out.println(B+"is the biggest number");
        
        }
         if(C>A&&C>B)
        {
        
            System.out.println(C+"is the biggest number");
        
        }
    }
    
}
