package eva1_20_swicth;

import java.util.Scanner;

public class EVA1_20_Swicth {
    public static void main(String[] args) {
        int dia;
        Scanner cap = new Scanner(System.in);
        System.out.println("Numero correspondiente al día(1-7)");
        dia =cap.nextInt();
        
        switch(dia){    
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Lunes");
            break;
        case 3:
            System.out.println("Martes");
            break;
        case 4:
            System.out.println("Miercoles");
            break;
        case 5:
            System.out.println("Jueves");
            break;
        case 6:
            System.out.println("Viernes");
            break;
        case 7:
            System.out.println("Sabado");
            break;
        default:
            System.out.println("Numero no valido");
        }
    }
    
}
