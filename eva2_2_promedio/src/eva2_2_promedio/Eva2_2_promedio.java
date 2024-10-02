/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva2_2_promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner captu= new Scanner (System.in);

int califa,acum;
acum=0;  //tines que declarar bariable y despues poner 0 para poder hacer nada   
for(int i = 1; i <=3; i++){
    System.out.println("alumno #"+i);
    System.out.println("cual es tu calificacion: ");
        califa=captu.nextInt();
        captu.nextLine();
        acum= acum + califa;
}
System.out.println("promedio="+(acum/3.0));
        

    }
    
}
