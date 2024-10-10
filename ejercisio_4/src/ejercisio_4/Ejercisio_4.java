/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercisio_4;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Ejercisio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        
         System.out.print("Ingresa una cadena de texto: ");
        String cadena = captu.nextLine();
        
        
        System.out.println("estas son las vocales de la cadena:");
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.toLowerCase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println(c);
            }
        }
    }
    
}
