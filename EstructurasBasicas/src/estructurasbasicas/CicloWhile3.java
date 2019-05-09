/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class CicloWhile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String mensajeFinal = "";
        String nombres = "";
        String apellidos = "";
        String profesion = "";
        String opcion = "";
        int contador = 1;
        boolean bandera = true;
        mensajeFinal = String.format("%s%s\n\n%s\n\n",mensajeFinal,
                "Informe de la ciudad de Loja","Listado de personas");
        while (bandera==true){
            
            System.out.println("Ingrese sus nombres:\n");
            nombres = scan.nextLine();
            System.out.println("Ingrese sus apellidos:\n");
            apellidos = scan.nextLine();
            System.out.println("Ingrese su profesion:\n");
            profesion = scan.nextLine();
            mensajeFinal = String.format("%sPersona "
                    + "%d: %s %s - %s\n",mensajeFinal,contador,
                    nombres,apellidos,profesion);
            contador = contador + 1;
            System.out.println("Digite 'n' para salir");
            opcion = scan.nextLine();
            if(opcion.equals("n")){
                bandera = false;
            } 
            
        }
        
        System.out.printf("%s",mensajeFinal);
    } 
}
