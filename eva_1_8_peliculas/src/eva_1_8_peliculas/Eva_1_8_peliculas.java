/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_8_peliculas;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva_1_8_peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  String nombre;
  String genero;
  int duracion;
  String reparto;
  String clasificacion;
  //cree el scanner 
  Scanner captu;
  captu=new Scanner (System.in);
  //introdusco lo que necesito 
  System.out.println("cual es el nombre de la pelicula?");
  nombre=captu.nextLine();
  
  System.out.println("que genero es?");
  genero=captu.nextLine();

  
  System.out.println("cual es la duracion en segundos:");
  duracion=captu.nextInt();
  
    System.out.println("cual es su reparto?");
  reparto=captu.nextLine();
  
  System.out.println("su clasificacion:");
  clasificacion=captu.nextLine();
   //aqui ya esta todo capturado
   
   
  System.out.print("...........todos sus datos..............");
  System.out.println(nombre);
  System.out.println(genero);
  System.out.println(duracion);
  System.out.println(reparto);
  System.out.println(clasificacion);

  //solo si hay problemas de captura despues de capturar un entero

    }
    
}
