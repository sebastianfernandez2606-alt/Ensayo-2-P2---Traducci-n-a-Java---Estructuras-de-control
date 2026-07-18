package notaestudiante;

import java.util.Scanner;


 // @author Jefferson Sebastian Fernandez Criollo

public class NotaEstudiante {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       
       double nota;
       
       System.out.println ("Ingrese la nota del Estudiante: ");
       nota = sc.nextDouble();
       
       if (nota >=7) {
           System.out.println("Aprobado");
       } else {
           System.out.println("Reprobado");
       }
    }
}