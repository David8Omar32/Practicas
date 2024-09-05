package eva1_10_formulas;
import java.util.Scanner;

public class EVA1_10_Formulas {
    public static void main(String[] args) {
        //Datos
        double velosIn, aceler, tiempo, distancia;
        Scanner formula = new Scanner(System.in);
        
        //Formulas
        System.out.println("Calculando distancia \nVelocidad inicial (m/s): ");
        velosIn = formula.nextDouble();
        System.out.println("Tiempo (en segundos): ");
        tiempo = formula.nextDouble();
        System.out.println("Velocidad aceleracion (en segundos): ");
        aceler = formula.nextDouble();
        
        //Solución
        distancia = (velosIn * tiempo) + ((aceler * (tiempo * tiempo))/2);
        System.out.println("\nLa distancia recorrida es: " + distancia + "m");
    }
    
}
