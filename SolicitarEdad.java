package solicitaredad;

import java.util.Scanner;


 // @author Jefferson Sebastian Fernandez Criollo

public class SolicitarEdad {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
        
       int edad;
        
       System.out.println("Ingrese su edad: ");
       edad = sc.nextInt();
       
       if (edad >= 18) {
           System.out.println("Es mayor de edad2");
       }
    }
}
        