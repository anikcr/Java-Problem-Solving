/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysort;

import java.util.Arrays;

/**
 *
 * @author Anik
 */
public class Arraysort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[] total = new int[]{ 1,9,4,5,6,7,8,50 };
     Arrays.sort(total);
     for(int i=0;i<total.length;i++)
     System.out.println("sorted"+total[i]);
    }
    
}
