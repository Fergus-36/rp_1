/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva_1_5_entrada_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String nombre;
       
       //captura de datos del teclado;
       //sanner     herramienta(clase)
       //sacanner; es un tipo de datos
       Scanner captu; //incorpora la herramienta al codigo
       //no existe hay que crearlo
       captu=new Scanner (System.in);//con esto creamos la herramienta scanner
       
       //primero le decimor al usuario que tiene que capturar
       System.out.println("cual es tu nombre completo:");
       nombre=captu.nextLine();//caputra del texo que escribe el usuario asta precionar "enter"
       //depende de la fucion qiue quieras sera un codigo distinto
       
       //es hora de imprimir los datos
       System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡captura de datos¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
       System.out.println(nombre);
    }
    
}
