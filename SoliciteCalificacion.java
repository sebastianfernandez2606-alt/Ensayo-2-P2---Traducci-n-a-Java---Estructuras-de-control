package solicitecalificacion;

import java.util.Scanner;


 // @author Jefferson Sebastian Fernandez Criollo

public class SoliciteCalificacion {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       double calificacion; 
       
       System.out.println ("Ingrese una Calificacion (entre 0 y 10): ");
       calificacion = sc.nextDouble();
       
       if (calificacion >= 9 && calificacion <= 10){
           System.out.println("Excelente");
           } else if (calificacion >= 8 && calificacion <= 8.99) {
            System.out.println("Muy Bueno");
        } else if (calificacion >= 7 && calificacion <= 7.99) {
            System.out.println("Bueno");
        } else if (calificacion >= 5 && calificacion <= 6.99) {
            System.out.println("Regular");
        } else if (calificacion >= 0 && calificacion <= 4.99) {
            System.out.println("Deficiente");
        } else {
            System.out.println("Nota incorrecta. Por favor ingrese un numero entre 0 y 10.");
       }
    }
}
