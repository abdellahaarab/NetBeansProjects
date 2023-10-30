/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Administrator
 */
public class Etudiant {
    public static String name;
    public static int poids;
    
    public Etudiant() {
    }

    public static String getName() {
        return name;
    }

    public static int getPoids() {
        return poids;
    }

    public static void setName(String name) {
        Etudiant.name = name;
    }

    public static void setPoids(int poids) {
        Etudiant.poids = poids;
    }

    @Override
    public String toString() {
        return "Nome : "+ name + " Poids : " + poids + "";
    }
    
    
    public static void setEtudiant(String n, int p){
        name = n;
        poids = p;
    }
    public static void getEtudiant(){
        System.out.print("Nome : "+ name + " Poids : " + poids);
    }
}
