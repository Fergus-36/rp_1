/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_16_hacienda;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva_1_16_hacienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char tipo;
        Scanner captu= new Scanner (System.in);
        System.out.println("Tipo de persona f===fisica, persona m====moral");
        tipo=captu.nextLine().charAt(0);
        System.out.println(tipo);
        // imprimir el tipo de persona
        //"" es cadena de texto ´´´ es una cadena 
        //´´f´´
        
        if(tipo=='f'){
            System.out.println("fisica");
        }else{
        System.out.println("moral");
        }
    
         }
    
}
