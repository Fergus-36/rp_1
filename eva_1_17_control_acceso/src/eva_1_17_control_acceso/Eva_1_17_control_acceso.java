/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_17_control_acceso;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva_1_17_control_acceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // los operadores logicos solo resiven valores logicos es decrir verdadero o falso 
        // and---
        
        String nombre, cont;
        
        Scanner captu= new Scanner (System.in);
        
        System.out.println("nombre del usurario: ");
        nombre=captu.nextLine();
        System.out.println("contraseña: ");
        cont=captu.nextLine();
        
        if(nombre.equals("admi")&& cont.equals("1234")){
        System.out.println("acceso denegado");
        }else{
        System.out.println("acceso deneguado");
        }
    }
    
}
