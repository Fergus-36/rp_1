/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercisio_3;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Ejercisio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner captu = new Scanner(System.in);       

    String texto;
        
    System.out.print("Ingresa lo que quieras decir: ");
    
    texto = captu.nextLine();
        
     
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(i);
        }
    }
    
}
