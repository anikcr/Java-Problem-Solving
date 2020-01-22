/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Anik
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        overloadingcon ob1 =new overloadingcon();
          overloadingcon ob2 =new overloadingcon("anik","crickter");
          ob2.display();
           overloadingcon ob3 =new overloadingcon("hafiz","crickter",987);
          ob3.display();
    }
    
}
