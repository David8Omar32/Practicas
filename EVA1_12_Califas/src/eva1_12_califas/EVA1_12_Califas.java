package eva1_12_califas;

import java.util.Scanner;

public class EVA1_12_Califas {
    public static void main(String[] args) {
        double calificacion;
        
        Scanner cali = new Scanner (System.in);
        
        System.out.println("Deposite su acredita: ");
        calificacion = cali.nextDouble();
        
        if (calificacion > 100){
            System.out.println("Introduzca un numero aceptable");
        } else if(calificacion < 0){
            System.out.println("No se aceptan numero negativos");
        } else if (calificacion >= 70){
            System.out.println("Usted califica con un " + calificacion);
        } else{
            System.out.println("N/A");
        }
    }
    
}
