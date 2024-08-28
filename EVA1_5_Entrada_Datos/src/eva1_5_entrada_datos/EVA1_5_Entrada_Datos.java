package eva1_5_entrada_datos;

import java.util.Scanner;

public class EVA1_5_Entrada_Datos {

    public static void main(String[] args) {
        //Declaracion de variables
        String modelo, marca;
        int year;
        double precio;

        //Captura de datos
        Scanner captura;
        captura = new Scanner(System.in);
        
        //Instrucciones del usuario
        System.out.println("Ingresa un marca del vehiculo");
        //Capturamos
        marca = captura.nextLine();
        //Instrucciones del usuario
        System.out.println("Ingresa un modelo del vehiculo");
        //Capturamos
        modelo = captura.nextLine();
        //Instrucciones del usuario
        System.out.println("Ingresa un año del vehiculo");
        //Capturamos
        year = captura.nextInt();
        //Instrucciones del usuario
        System.out.println("Ingresa un precio del vehiculo");
        //Capturamos
        precio = captura.nextDouble();
        
        //Muestra los datos escaneados
        System.out.println("\n"+ "El carro que buscas tiene las especificaciones:" +"\n" + "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Año: " + year + "\n" + "Precio: " + precio);
        
    }
}
