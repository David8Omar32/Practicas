package eva1_18_if_else_anidado;

import java.util.Scanner;

public class EVA1_18_If_Else_Anidado {
    public static void main(String[] args) {
        int dia;
        Scanner cap = new Scanner(System.in);
        System.out.println("Numero correspondiente al día(1-7)");
        dia =cap.nextInt();
        
        if(dia==1){
            System.out.println("Domingo");
        } else if(dia==2){
            System.out.println("Lunes");
        } else if(dia==3){
            System.out.println("Martes");
        } else if(dia==4){
            System.out.println("Miercoles");
        } else if(dia==5){
            System.out.println("Jueves");
        } else if(dia==6){
            System.out.println("Viernes");
        } else if(dia==7){
            System.out.println("Sabado");
        } else{
            System.out.println("Numero no valido");
        }
        
        
    }
    
}
