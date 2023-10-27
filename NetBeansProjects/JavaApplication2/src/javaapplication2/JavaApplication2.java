/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import pm.Eleve;
import pm.Eleve1;

/**
 *
 * @author Administrator
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        Eleve1 e1 = new Eleve1();
        e1.index();
        e1.name = "Abdellah";
        e1.getName();
        e1.setAge(22);
        e1.getAge();
        
        Eleve1 e2 = new Eleve1();
        e2.index();
        e2.name = "KARIM";
        e2.getName();
        e2.setAge(100);
        e2.getAge();
        
        
        Eleve el1 = new Eleve("Ghost",9201);
        el1.afficher();
        

   
    }
    
}
