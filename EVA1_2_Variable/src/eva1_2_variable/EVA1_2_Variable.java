package eva1_2_variable;
public class EVA1_2_Variable {
    public static void main(String[] args) {
        //Declaracion de una variable de tipo entero y el nombre de este
        int edad;
        String nombre;
        String apellidos;
        double promedio;
        
        //Asignar valores
        edad = 18;
        nombre = "David Omar";
        apellidos = "Gil Gómez";
        promedio = 9.2;
        
        //Cadena de texto
        System.out.println("Hola mundo!!");
        //Numero entero
        System.out.println(5);
        //Un caracter
        System.out.println('c');
        //Valores logicos
        System.out.println(true);
        System.out.println(false);
        //Numeros con fraccion (Numero flotante)
        System.out.println(1050.52);
   
        System.out.println("Tu edad es: " + edad);
        System.out.println("Tu nombre es: " + nombre + apellidos);
        System.out.println("Con un promedio de " + promedio);
        
    }
    
}
