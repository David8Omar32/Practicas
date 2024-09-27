package eva1_22_califas;

import java.util.Scanner;

public class EVA1_22_Califas {
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        double cali;
        
        System.out.println("Porcentaje de la calificaión");
        cali = cap.nextDouble();
        
        if(cali >= 93 && cali <= 100){
            System.out.println("A");
        } else if(cali >= 90 && cali <= 92.99){
            System.out.println("A-");
        } else if(cali >= 87 && cali <= 89.99){
            System.out.println("B+");
        } else if(cali >= 83 && cali <= 86.99){
            System.out.println("B");
        } else if(cali >= 80 && cali <= 82.99){
            System.out.println("B-");
        } else if(cali >= 77 && cali <= 79.99){
            System.out.println("C+");
        } else if(cali >= 73 && cali <= 76.99){
            System.out.println("C");
        } else if(cali >= 70 && cali <= 72.99){
            System.out.println("C-");
        } else if(cali >= 67 && cali <= 69.99){
            System.out.println("D+");
        } else if(cali >= 60 && cali <= 66.99){
            System.out.println("D");
        } else if(cali >= 00 && cali <= 59.99){
            System.out.println("F");
        } else {
            System.out.println("No es un numero aceptable");
        }
    }
    
}
