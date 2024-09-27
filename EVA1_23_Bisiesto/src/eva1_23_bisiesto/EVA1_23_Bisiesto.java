package eva1_23_bisiesto;
import java.util.Scanner;

public class EVA1_23_Bisiesto {
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int year,a,b,c;
        
        System.out.println("Introduzca un año");
        year = cap.nextInt();
        
        a = year % 4;
        b = year % 400;
        c = year % 100;
        
        if(a==0 && c==0){
            if(b==0){
                System.out.println("Es bisiesto");
            } else if(b==1){
                System.out.println("No es bisiesto");
            }
        } else if (a==0 && c!=0){
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
        
    }
    
}
