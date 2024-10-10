/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercisio2;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Ejercisio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        
        int num1,num2;
        
         System.out.print("que numero quieres: ");
         num1 = captu.nextInt();
        System.out.print("ahora necestio un numero mas: ");
         num2 = captu.nextInt();
         
         
          System.out.println("Números en orden descendente:");
        if (num1 >= num2) {
            for (int i = num1; i >= num2; i--) {
                System.out.println(i);
            }
        } else {
            for (int i = num2; i >= num1; i--) {
                System.out.println(i);
            }
    }
        
        System.out.println("numeros en orden ascendente:");
        if (num1 <= num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = num2; i <= num1; i++) {
                System.out.println(i);
            }
        }
        
      
       
    }
}