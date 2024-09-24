package eva1_14_tipo_hacienda;

import java.util.Scanner;

public class EVA1_14_Tipo_Hacienda {
    public static void main(String[] args) {
        char tipo;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Calpura el tipo de persona F(Fisica), M(Moral)");
        tipo = captu.nextLine().charAt(0);
        
        //System.out.println(tipo);
        if(tipo=='F'){
            System.out.println("Persona fisica");
        } else if (tipo=='M'){
            System.out.println("Persona moral");
        } else if (tipo=='f'){
            System.out.println("Persona fisica");
        } else if (tipo=='m'){
            System.out.println("Persona moral");
        } else {
            System.out.println("Caracter inesperado");
        }
    }
    
}
