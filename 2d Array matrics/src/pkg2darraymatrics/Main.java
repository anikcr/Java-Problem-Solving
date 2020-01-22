
package pkg2darraymatrics;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
       int A [][]=new int [2][3];
       int B [][]=new int [2][3];
       int C [][]=new int [2][3];
       for(int row=0;row<2;row++)
       {
       for(int col=0;col<3;col++)
       {
        A[row][col]=S.nextInt();
       
       }
       }
       System.out.println("A=");
      for(int row=0;row<2;row++)
       {
       for(int col=0;col<3;col++)
       {
       System.out.print(" "+A[row][col]);
       
       }
       System.out.println();
       
       }
      
     for(int row=0;row<2;row++)
       {
       for(int col=0;col<3;col++)
       {
        A[row][col]=S.nextInt();
       
       }
       }
       System.out.println("B=");
      for(int row=0;row<2;row++)
       {
       for(int col=0;col<3;col++)
       {
       System.out.print(" "+A[row][col]);
       
       }
       System.out.println();
       
       } 
      System.out.println("A+B");
      for(int row=0;row<2;row++)
       {
       for(int col=0;col<3;col++)
       {
         C[row][col]=A[row][col]+B[row][col];
        System.out.println("\t"+(C[row][col]));
       }
       System.out.println();
    }
    }
}
    

