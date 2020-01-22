/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Anik
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      conclass ob=new conclass("Anik","crickter",12);
      ob.display();
       conclass ob1=new conclass("hafiz","botom",12);
      ob1.display();
       conclass one= new conclass();
      one.display();
    }
    
}
