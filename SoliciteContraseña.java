package solicitecontraseña;

import java.util.Scanner;

public class SoliciteContraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String claveCorrecta = "java2026" ;
        String intento;
        System.out.println("Ingrese la contrasena: ");
        intento = sc.nextLine();
        
       do{
            System.out.println("Ingrese la contrasenia: ");
            intento = sc.nextLine();
            if (!intento.equals(claveCorrecta)){
            System.out.println("Contrasenia Incorrecta. Intente otra vez");            
            }
        } while (!intento.equals(claveCorrecta));
        System.out.println("Acceso concedido.");
    }
}    