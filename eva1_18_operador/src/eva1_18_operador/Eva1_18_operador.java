/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_operador;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva1_18_operador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu= new Scanner (System.in);
        int km, meses;
        // if else son solo dos opciones 
        System.out.println("tu kilometraje: ");
        km=captu.nextInt();
        captu.nextLine();
         
       System.out.println("tus meses");
        meses=captu.nextInt();
       captu.nextLine();
       
        if (km >=5000 || meses >=6){
        System.out.println("cambio de aceite");    
        }else{
        System.out.println("esta bien el carro");
        }
    }
    
}
