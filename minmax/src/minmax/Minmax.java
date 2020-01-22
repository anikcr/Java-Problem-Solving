/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmax;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Minmax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner S= new Scanner (System.in);
        System.out.println("enter the array size");
        int A = S.nextInt();
        int number[]=new int[A];
        System.out.println("enter yoour array element");
        for(int i=0; i<number.length;i++)
            
        {
            number[i]=S.nextInt();
            
        }
            int max= number[0];
            int min= number[0];
         for(int i=1; i<number.length;i++)
         {
            if(max<number[i])
            {
            max =number[i];
            
            
            }
            if(min>number[i])
            {
            min=number[i];
            
            }
         }
          System.out.println("the size of array :"+number.length);
         System.out.println("the maximum number in the list is :"+max);
          System.out.println("the minium number in the list is :"+min);
       
        
        }
           
      
    }
    

