package eva1_6_pelicula;
import java.util.Scanner;

public class EVA1_6_Pelicula {

    public static void main(String[] args) {
        String nombre,reparto,clasificacion,genero;
        int duracion;
        
        //Captura de datos
        Scanner captura;
        captura = new Scanner(System.in);
        
        System.out.println("Nombre de la pelicula: ");
        nombre = captura.nextLine();
        
        System.out.println("Genero de la pelicula: ");
        genero = captura.nextLine();
        
        System.out.println("Reparto de la pelicula: ");
        reparto = captura.nextLine();
        
        System.out.println("Clasificacion de la pelicula");
        clasificacion = captura.nextLine();
        
        System.out.println("Duracion de la pelicula:");
        duracion = captura.nextInt();
        
        System.out.println("\n"+ "Nombre: " + nombre + "\n" + "Genero: " + genero + "\n" + "Reparto: " + reparto + "\n" + "Clasificacion: " + clasificacion + "\n" + "Duracion: " + duracion);
    }
    
}
