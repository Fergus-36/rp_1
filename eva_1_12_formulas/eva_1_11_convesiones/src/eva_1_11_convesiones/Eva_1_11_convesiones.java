/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_11_convesiones;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva_1_11_convesiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONVESRIONES DE TEMPERATURAS
        
    double far, cent, kal;
    Scanner captu= new Scanner (System.in);
    
    System.out.println("captura los grados fahrenen");
    far=captu.nextDouble();
    cent=(far-32)/1.8; //este codigo se le denomia expreccion
    System.out.println("°C= "+ cent);
    
    System.out.println("captura los datos en centigrados");
    cent=captu.nextDouble();
    far=(cent*1.8)+32;
    System.out.println("°F= "+ far);
    
    System.out.println("captura los datos en kelvin");
    kal=captu.nextDouble();
    cent=kal + 273.15;
    System.out.println("°K= "+ cent);
    }
    
}
