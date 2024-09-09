package eva1_11_if;

import java.util.Scanner;

public class EVA1_11_If {
    public static void main(String[] args) {
        int edad;
        Scanner proceso = new Scanner(System.in);
        
        System.out.println("Introduzca su edad: ");
        edad = proceso.nextInt();

        if (edad >= 150) {
            System.out.println("No se aceptan numeros tan altos");
        } else if (edad <= 0) {
            System.out.println("No se aceptan numeros negativos");
        } else if (edad >= 18){
            System.out.println("Su edad es " +edad + ", usted es un adulto");
        }else {
            System.out.println("Usted es menor de edad");
        }
    }
    
}
