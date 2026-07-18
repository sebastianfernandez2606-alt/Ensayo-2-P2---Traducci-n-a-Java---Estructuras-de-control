
package solicitardatos;

import java.util.Scanner;


 // @author Jefferson Sebastian Fernandez Criollo

public class SolicitarDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nombre;
        int edad;
        String carrera;
        double estatura;
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println("Ingrese su carrera: ");
        carrera = sc.nextLine();
        System.out.println("Ingrese su estatura: ");
        estatura = sc.nextDouble();
        
        System.out.println();
        System.out.println("Nombre:"+ nombre);
        System.out.println("Edad:"+ edad);
        System.out.println("Carrera: "+ carrera);
        System.out.println("Estatura: "+ estatura);
    }
    
}
