/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perametermethode;

/**
 *
 * @author Anik
 */
public class sub {
    String name,position;
    int phone;
    void set( String n,String m,int k)
    {
            name =n;
            position =m;
            phone=k;
    }    
    
    void display()
    {
    System.out.println("The name is "+name);
    System.out.println("The position is "+position);
    System.out.println("The position is "+phone);
    }

    
    
}
