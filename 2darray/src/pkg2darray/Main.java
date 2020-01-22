/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darray;

import java.util.Scanner;

/**
 *
 * @author Anik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S =new Scanner(System.in);
        int[][] A =new int[2][3];
          int[][] B=new int[2][3];
          
        for(int row=0;row<=2; row++)
        {
        for( int col=0; col<=3;col++)
        {
        A[row][col] = S.nextInt();
        
        
        }
        
        }
        for(int row=0;row<=2; row++)
        {
        for( int col=0; col<=3;col++)
        {
        System.out.println(+A[row][col]);
        
        
        }
        System.out.println("");
        }
        
    }
    
}
