/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva2_12_numero_mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        
     int num, masgrande=-9999; 

     do{
     System.out.println("un numero entero:");
     num= captu.nextInt();
    captu.nextLine(); 
     
    
    if(num>masgrande);
masgrande=num;    
     }while(!(num==-1));
        System.out.println(masgrande);
     }   
        
     
  
        
        
        
    }
   

