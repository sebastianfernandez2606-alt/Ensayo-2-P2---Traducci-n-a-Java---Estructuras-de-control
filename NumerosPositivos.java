package numerospositivos;

import java.util.Scanner;


 // @author Jefferson Sebastian Fernandez Criollo

public class NumerosPositivos {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numero;
       int cantidad = 0;
       int suma = 0;
       
        System.out.println("Ingrese un numero positivo (un negativo para terminar): ");
        numero = sc.nextInt();
        
        while (numero >= 0) {
            cantidad = cantidad + 1;
            suma = suma + numero;
            
            System.out.println("Ingrese otro numero positivo: ");
            numero = sc.nextInt();
        }
        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);
    }
}