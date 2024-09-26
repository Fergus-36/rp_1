/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_switch;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class EVA1_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner captu= new Scanner (System.in); 

    int diasem; 
    
    System.out.println("que dia es(1 al 7): ");
    diasem= captu.nextInt();//es mejor poner int que line
    captu.nextLine();
   //elegir multiples herramientas
    switch (diasem){
        case 1://solo se pueden numeros enteros 
            System.out.println("domingo");
            break;//si quitas el break el codigo seguira para eso se delimita 
        case 2:
            System.out.println("lunes");
            break;
        case 3:
            System.out.println("martes");
            break;
        case 4:
            System.out.println("miercoles");
            break;
        case 5:
            System.out.println("jueves");
            break;
        case 6:
            System.out.println("viernes");
            break;
        case 7:
            System.out.println("domingo");
            break;
        default: //esto ejectua cuando no existe la opcion 
            System.out.println("no es permitido");
    }
    
    
    
    
    
    }
    
}
