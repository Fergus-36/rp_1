/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evs_2_10_valida;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Evs_2_10_valida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner captu= new Scanner (System.in); 
    
    
    int diasem; 
    
    System.out.println("que dia es(1 al 7): ");
    diasem= captu.nextInt();//es mejor poner int que line
    captu.nextLine();
    
    do{
    
    
     
    }while(diasem <1 || diasem>7);
    
    
    
      if(diasem ==1){
    System.out.println("domingo");
    }
    else if (diasem ==2){
    System.out.println("lunes");
    }
     else if (diasem ==3){
    System.out.println("martes");
    }
     else if (diasem ==4){
    System.out.println("miercoles");
    }
     else if (diasem ==5){
    System.out.println("jueves");
    }
     else if (diasem ==6){
    System.out.println("viernes");
    }
     else if (diasem ==7){
    System.out.println("sabado");
    }
     else{
    System.out.println("invalido");
    }
    
    }    
}
