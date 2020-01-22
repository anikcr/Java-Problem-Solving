/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearaay;

/**
 *
 * @author Anik
 */
import java.util.Scanner;

public class Simplearaay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        int size =0;
        int result =0;

        Scanner S = new Scanner(System.in);

        int number[] = new int[6];
        for (int i = 0; i<number.length; i++) {
            number[i] = S.nextInt();
            sum = sum + number[i];
            size=(number.length/2)-1;
            result =number[size];
        }
        System.out.println("the middle element "+ result);
        System.out.println("the sum of thise number" + sum);

    }

}
