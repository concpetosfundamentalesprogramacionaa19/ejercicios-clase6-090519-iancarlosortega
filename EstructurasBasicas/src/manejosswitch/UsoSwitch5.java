/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. desarrollar una aplicacion que me permita ingresar placas de carros se asume que las plcacas ingresadas pertenecen a la region costa del ecuador, en base a la placa nuestto programa determinara y presentara la placa con la provincia a la que pertenece
 */
package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        String placa = "";
        System.out.println("Ingrese la placa de su carro ");
        placa = scan.nextLine();
        char valor = placa.charAt(0);
                
        switch(valor){
            case 'o':
            case'O':
                System.out.printf("Nombre con inicial %s de El Oro", 
                        valor);
                break;
            
            case 'e':
            case 'E':
                System.out.printf("Nombre con inicial %s de Esmeraldas", 
                        valor);
                break; 
            
            case 'g':
            case 'G':
                System.out.printf("Nombre con inicial %s del Guayas", 
                        valor);
                break;
            
            case 'm':
            case 'M':
                System.out.printf("Nombre con inicial %s de Manabi", 
                        valor);
                break;
                
            case 'r':
            case 'R':
                System.out.printf("Nombre con inicial %s de Los Rios", 
                        valor);
                break;
                
            case 'Y':
            case 'y':
                System.out.printf("Nombre con inicial %s de Santa Elena", 
                        valor);
                break; 
                
            case 'j':
            case 'J':
                System.out.printf("Nombre con inicial %s de Santo Domingo de"
                        + "los Tsachilas", valor);
                break;    
            default:
                System.out.println("ninguna de las anteriores");
                
        }
        
    }
}
