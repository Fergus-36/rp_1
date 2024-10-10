/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercisio_5;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Ejercisio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num;
        
    System.out.print("ingresa un numero: ");
    num = captu.nextInt();
        
      
    for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
