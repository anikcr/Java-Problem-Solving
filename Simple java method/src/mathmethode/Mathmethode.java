/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmethode;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Mathmethode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner S =new Scanner(System.in);
      int A= S.nextInt();
      double B= S.nextInt();
   double area =  Math.pow(A, B) ;
   double squrae= Math.sqrt(A);
   double absolate= Math.abs(A);
   int round = Math.round(A);
      System.out.println (area+"this is the are");
      System.out.println (squrae+"this is the are");
    }
    
}
