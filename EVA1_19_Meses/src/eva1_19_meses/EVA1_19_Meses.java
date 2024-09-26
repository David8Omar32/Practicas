package eva1_19_meses;

import java.util.Scanner;

public class EVA1_19_Meses {
    public static void main(String[] args) {
        int dia;
        Scanner cap = new Scanner(System.in);
        System.out.println("Numero correspondiente al mes(1-12)");
        dia =cap.nextInt();
        
        if(dia==1){
            System.out.println("Enero");
        } else if(dia==2){
            System.out.println("Febrero");
        } else if(dia==3){
            System.out.println("Marzo");
        } else if(dia==4){
            System.out.println("Abril");
        } else if(dia==5){
            System.out.println("Mayo");
        } else if(dia==6){
            System.out.println("Junio");
        } else if(dia==7){
            System.out.println("Julio");
        } else if(dia==8){
            System.out.println("Agosto");
        } else if(dia==9){
            System.out.println("Septiembre");
        } else if(dia==10){
            System.out.println("Octubre");
        } else if(dia==11){
            System.out.println("Noviembre");
        } else if(dia==12){
            System.out.println("Diciembre");
        } else{
            System.out.println("Numero no valido");
        }
    }
    
}
