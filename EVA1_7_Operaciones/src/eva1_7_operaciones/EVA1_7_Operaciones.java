package eva1_7_operaciones;

import static java.lang.Math.sqrt;

public class EVA1_7_Operaciones {
    public static void main(String[] args) {
        //Operaciones aritmeticas
        //-Variables
        double x,y,suma,resta,multiplicacion,division,raiz,raiz2,potencia;
        y = 11;
        x = 5;
        
        suma = x + y;
        resta = x - y;
        division = x/y;
        multiplicacion = x * y;
        raiz = Math.pow(x,0.5);
        raiz2 = sqrt(y);
        potencia = Math.pow(x,y);
        
        System.out.println("La suma es: " + suma + "\n" + "La resta es: " + resta + "\n" + "La multiplicacion es: " + multiplicacion + "\n" + "La division es: " + division + "\n" + "La raiz es: " + raiz + "\n" + "La raiz de y es: " + raiz2 + "\n" + "La potencia es: " + potencia);
    }
    
}
