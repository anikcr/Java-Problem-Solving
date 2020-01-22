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
public class overloadingcon {
        String name,position;
    int phone;
    overloadingcon()
    {
    
    System.out.println("no data available here");
    
    }
    overloadingcon(String n,String p)
    {
        name=n;
        position=p;
    
    }
      overloadingcon(String n,String p,int t)
    {
    name =n;
    position=p;
    phone=t;
    
    
    }
      void display()
      {
      
      System.out.println("NAME" +name);
        System.out.println("NAME" +position);
          System.out.println("NAME" +phone);
      
      }
}
