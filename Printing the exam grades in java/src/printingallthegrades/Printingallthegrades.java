/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printingallthegrades;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Printingallthegrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner S= new Scanner (System.in);
       System.out.println("Enter your number");
        for(int i=0;i<=5;i++)
        {
        int Score=S.nextInt();
       
        if(Score>=90)
        {
        System.out.println( Score+" = A");
        }
        else if(Score>=80){
        
        System.out.println("the grade is B");
        }
        else if(Score>=70)
        {
        System.out.println("the grade is C");
        
        }
        else{
        System.out.println("you are D");
        
        }
    }
    }
    
}
