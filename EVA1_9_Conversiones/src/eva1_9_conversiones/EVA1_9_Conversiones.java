/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_conversiones;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_9_Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Datos definidos
        double centigrados, faren, cenToFaren, farenToCen, farenToKel, cenToKel;
        
        //Pedida de datos
        Scanner trans = new Scanner(System.in);
        System.out.println("Grados: ");
        centigrados = trans.nextDouble();
        
        //Calculos
        cenToFaren = (centigrados * 1.8) + 32;
        
        //Funciones
        System.out.println("Estos grados centigrados en Farenheit es (ºF): " + cenToFaren);
        
        //Pedida de datos
        System.out.println("FarenHeit: ");
        faren = trans.nextDouble();
        
        //Calculos
        farenToCen = (faren-32)/1.8;
        
        //Funciones
        System.out.println("Estos grados farenheit a centigrados es (ºC): " + farenToCen);
        
        //Kelvin
        System.out.println("Convirtiendo datos de Farenheit a Kelvin \n (ºF): ");
        faren = trans.nextDouble();
        farenToCen = (faren-32)/1.8;
        farenToKel= farenToCen + 273.15;
        System.out.println("Estos grados farenheit a Kelvin es (ºK): " + farenToKel);
        
        System.out.println("Convirtiendo datos de Centigrados a Kelvin \n (ºC): ");
        centigrados = trans.nextDouble();
        cenToKel = centigrados + 273.15;
        System.out.println("Estos grados farenheit a Kelvin es (ºK): " + farenToKel);
    }
    
}
