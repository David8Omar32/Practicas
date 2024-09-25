package eva1_17_rangos;

import java.util.Scanner;

public class EVA1_17_Rangos {
    public static void main(String[] args) {
        int cali;
        Scanner cap = new Scanner(System.in);
        System.out.println("Calificacion del alumno");
        cali = cap.nextInt();
        
        if(cali >= 70 && cali <= 100){
            System.out.println("Calificación aprovatoria");
        } else if (cali < 70 && cali >= 0){
            System.out.println("Calificación reprovatoria");
        } else if (cali < 0 || cali > 100){
            System.out.println("Numero inesperado");
        } else {
            System.out.println("Error improbable");
        }
    }
    
}
