package eva1_16_operador_or;

import java.util.Scanner;
public class EVA1_16_Operador_or {
    public static void main(String[] args) {
        int km,nm;
        
        Scanner cap = new Scanner(System.in);
        System.out.println("Servicio de auto(Mantenimiento)");
        
        System.out.println("¿Cual es la cantidad de kilometros recorridos?");
        km = cap.nextInt();
        
        System.out.println("¿Cuantos meses tiene el vehiculo?");
        nm = cap.nextInt();
        
        if (km >= 5000 || nm >= 6){
            System.out.println("Cambio de aceite");
        } else {
            System.out.println("Vehiculo en buenas condiciones");
        }
    }
    
}
