/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercisio1_eva2;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Ejercisio1_eva2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int numero;
        String texto;
        
           System.out.println("algo que quieras decir?");
        texto=captu.nextLine();
            
        System.out.println("y cuantas veces lo repetiras?");
        numero=captu.nextInt();
        captu.nextLine();
        for(int i=1; i<=numero; i++){
         
        System.out.println(texto+numero);
        }
     

    }
    
}
