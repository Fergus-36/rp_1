/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva2_3_potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        
        int base, expo;
       int acum=1;
        
        System.out.println("tu base:");
        base=captu.nextInt();
        captu.nextLine();
        System.out.println("introduce el exponete");
        expo=captu.nextInt();
        captu.nextLine();
        
        for(int i=1; i<=expo ; i++){
       
            acum= acum*base;
       
        }
        System.out.print("potnecia ="+ acum); 
        
    }
    
}
