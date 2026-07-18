package mostrardia;

import java.util.Scanner;


 // @author Jefferson Sebastian Fernandez Criollo

public class MostrarDia {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int dia;
       System.out.println ("Ingrese un numero entre 1 y 7: ");
       dia = sc.nextInt();
       
       switch (dia) {
           case 1: 
               System.out.println("Lunes");
               break; 
           case 2:
               System.out.println("Martes");
               break;
           case 3:
               System.out.println("Miercoles");
               break;
           case 4:
               System.out.println("Jueves");
               break;
           case 5:
               System.out.println("Viernes");
               break;
           case 6:
               System.out.println("Sabado");
               break;
           case 7:
               System.out.println("Domingo");
               break;
           default: 
               System.out.println("Numero incorrecto.");
               break; 
       }
    }
}
