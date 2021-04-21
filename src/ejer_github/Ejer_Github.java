/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_github;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ejer_Github {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String nombre;
        
        System.out.println("Escribe tu nombre completo");
        nombre=sc.nextLine();
        System.out.print("Las iniciales del nombre: "+nombre+" son: "); 
        inc(nombre);
    }
    
    public static void inc(String ln){
        String[] letras = ln.split(" ");
        
        for(int i=0; i<letras.length; i++) {
            System.out.print(letras[i].charAt(0)+" ");
            System.out.println(letras[i]);
        }
        
    }
    
}
