package eva1_15_pantalla_inicio;

import java.util.Scanner;

public class EVA1_15_pantalla_inicio {
    public static void main(String[] args) {
        //Constantes borrar despues
        final String USUARIO = "Admin";      
        final String PASSWORD = "1234";
        //Borrar despues

        String contra,usuario;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("User: ");
        usuario = captu.nextLine();
        
        System.out.println("Password: ");
        contra = captu.nextLine();
        
        if (usuario.equals(USUARIO) && contra.equals(PASSWORD)){
            System.out.println("Acceso Permitido");
        } else{
            System.out.println("Acceso Denegado");
        }
        
    }
    
}
