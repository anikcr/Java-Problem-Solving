/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestandsmallestarray;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Largestandsmallestarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        int A=S.nextInt();
        int number[]=new int[A];
        for(int i=0;i<number.length;i++){
        
        number[i]=S.nextInt();
        int max=number[0];
        int min=0;
        if(max<number[i])
        {
            max=number[i];
        
        }
        if (min>number[i])
        {
        min=number[i];
        
        
        }
        
        }
        
    }
    
}
