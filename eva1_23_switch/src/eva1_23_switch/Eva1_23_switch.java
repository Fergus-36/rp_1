/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_switch;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva1_23_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu= new Scanner (System.in); 
    
    int meses; 
    
    System.out.println("que mes es (1 al 12): ");
    meses= captu.nextInt();//es mejor poner int que line
    captu.nextLine();
    
    switch (meses){ 
    case 1:
        System.out.println("enero");
        break;
        case 2:
        System.out.println("febrero");
        break;
        case 3:
        System.out.println("marzo");
        break;
        case 4:
        System.out.println("abril");
        break;
        case 5:
        System.out.println("mayo");
        break;
        case 6:
        System.out.println("junio");
        break;
        case 7:
        System.out.println("julio");
        break;
        case 8:
        System.out.println("agosto");
        break;
        case 9:
        System.out.println("spetiembre");
        break;
        case 10:
        System.out.println("octubre");
        break;
        case 11:
        System.out.println("noviebre");
        break;
    case 12:
        System.out.println("diciembre");
        break;
      default: 
            System.out.println("no es permitido");
        
        
        
        
    }
    
    
    
    
    }
    
}
