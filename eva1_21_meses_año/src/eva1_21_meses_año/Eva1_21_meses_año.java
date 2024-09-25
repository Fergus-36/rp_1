/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_meses_año;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva1_21_meses_año {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner captu= new Scanner (System.in); 
    
    int meses; 
    
    System.out.println("que mes es (1 al 12): ");
    meses= captu.nextInt();//es mejor poner int que line
    captu.nextLine();
    
    if(meses ==1){
    System.out.println("enero");
    }
    else if (meses ==2){
    System.out.println("febrero");
    }
   else if (meses ==3){
    System.out.println("marzo");
    }
   else if (meses ==4){
    System.out.println("abril");
    }
   else if (meses ==5){
    System.out.println("mayo");
    }
   else if (meses ==6){
    System.out.println("junio");
    }
   else if (meses ==7){
    System.out.println("julio");
    }
   else if (meses ==8){
    System.out.println("agosto");
    }
   else if (meses ==9){
    System.out.println("septiembre");
    }
   else if (meses ==10){
    System.out.println("octubre");
    }
   else if (meses ==11){
    System.out.println("noviembre");
    }
   else if (meses ==12){
    System.out.println("diciembre");
    }
     else{
    System.out.println("invalido");
    }
    }
    
}
