/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_14_calificacion;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva_1_14_calificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
int calif;
 Scanner captu=new Scanner (System.in);
    System.out.println("que calificacion tienes? ");
    calif=captu.nextInt();
    
    if(calif >=70){
        System.out.println("si pasaste");
    }else {
        System.out.println("n/a");
    
    }
    }
    
}
