/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_18_cali;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva_1_18_cali {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    int califa;
    Scanner captu= new Scanner (System.in);
   
    System.out.println("tu calificacion: ");
    califa=captu.nextInt();
    
    if(califa>=0 && califa <=100){
   System.out.println("calificacion valida");
    }else{
   System.out.println("no valida");     
    }
    
   
        
        
        
        
        
        
    }
    
}
