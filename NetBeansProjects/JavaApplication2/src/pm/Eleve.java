/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm;

/**
 *
 * @author Administrator
 */
public class Eleve {
    public static String name;
    public static int age;
    
    public Eleve(String n, int a){
        name = n;
        age = a;
    }
    
    public static void afficher(){
        System.out.println("Nom est :"+name+" Age est :"+age);
    }
}
