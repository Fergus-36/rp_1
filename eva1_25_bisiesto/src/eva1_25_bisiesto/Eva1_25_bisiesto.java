/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva1_25_bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner captu= new Scanner (System.in); 

 int año;
 
System.out.println("año que quieras calcular");
año= captu.nextInt();  
     captu.nextLine();
  boolean Bisiesto = false;
  
      if (año % 4 == 0) {
            if (año % 100 == 0) {
                if (año % 400 == 0)
                    Bisiesto = true;
            } else {
                Bisiesto = true;
            }
        }

        if (Bisiesto) {
            System.out.println(año + " este año es bisiesto.");
        } else {
            System.out.println(año + " este año no es bisiesto.");
        }
    }         
  
  }   
     
    }
    

