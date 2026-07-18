package solicitenumeros;

import java.util.Scanner;


 // @author Jefferson Sebastian Fernandez Criollo

public class SoliciteNumeros {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numero;
       int suma = 0;
       double promedio; 
       
       for (int i = 1; i <= 10; i++){
           System.out.println("Ingrese el numero" + i + ": ");
           numero = sc.nextInt();
           suma = suma + numero;  
       }
       promedio = (double) suma / 10;
        System.out.println();
        System.out.println("La suma total es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}