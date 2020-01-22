/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcasedigitspelling;

/**
 *
 * @author Anik
 */
import java.util.Scanner;
public class Switchcasedigitspelling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int digit=0;
        Scanner S= new Scanner(System.in);
        System.out.println("Enter any digit");
        for(int i=0;i<=9;i++)
        {
        digit =S.nextInt();
        switch(digit)
        {
            case 0:
                System.out.println("Zero");
                break;
    case 1:
                System.out.println("one");
                break;
                case 2:
                System.out.println("two");
                break;
                case 3:
                System.out.println("three");
                break;
                case 4:
                System.out.println("four");
                break;
                case 5:
                System.out.println("five");
                break;
                case 6:
                System.out.println("six");
                break;
                case 7:
                System.out.println("seven");
                break;
                case 8:
                System.out.println("eight");
                break;
                case 9:
                System.out.println("nine");
                break;
                case 10:
                System.out.println("ten");
                break;
               
                default:
                
   
                System.out.println("this is not digit");
               
    }
    }
    } 
}
