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
public class conclass {
    String name,position;
    int phone;
    conclass(){
System.out.println("this is eoty");

}
   conclass(String k, String l,int m)   
   {
   name =k;
   position =l;
   phone =m;
   
   }
    void display()
    {
    System.out.println("The name is "+name);
    System.out.println("The position is "+position);
    System.out.println("The number is "+phone);
    }
    
}
