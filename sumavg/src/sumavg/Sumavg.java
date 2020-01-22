/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumavg;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Sumavg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0;
        Scanner S = new Scanner (System.in);
        int number[] = new int[5];
        for(int i=0; i<5; i++)
        {
            number[i] =S.nextInt();
           sum = sum +number[i];
        }
        System.out.println("the lenghth of array is" +number.length/2);
        System.out.println("the sum of all the number"+sum);
    }
    
}
