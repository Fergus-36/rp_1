/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_13_;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva_1_13_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner captu=new Scanner (System.in);
    // CAPTURE LA EDAD
    int edad;
    System.out.println("caul es la edad: ");
    edad=captu.nextInt();
    //instruccion if
    // si algo se cumple es verdadero
    //que ago si se cumple
    // si no se cumple es falso 
    if (edad >=18 ){
    System.out.println("adulto: mayor de edad");
    
    }else{ 
         System.out.println("menor de edad");
    }

    
    
    
    
    }
    
}
