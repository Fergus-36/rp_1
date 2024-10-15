/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_8_acceso;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva_2_8_acceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pantalla de validacion
        Scanner captu = new Scanner(System.in);
        //usuario y contraseña
        String cont, usua;
        
        System.out.println("usuario:");
        usua=captu.nextLine();
        System.out.println("contraseña:");
        cont=captu.nextLine();
        do{
        
            
        }while(!(usua.equals("admi")&& cont.equals("3312")));
        //! esto es un operador de negacion
//pantralla principal
        System.out.println("hola, esto es el programa principal");
        
        
        
    }
    
}
